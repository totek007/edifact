package org.edifree.edifact.main.creator;

import org.edifree.edifact.main.creator.objects.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class ClassGeneratorFromSource {

    private static String DIRECTORY_FOR_HTML_FILES ="C:\\home\\";

    public static void main(String[] args) throws Exception {
        generateJavaFilesFromPath();
    }

    public static void generateJavaFilesFromPath() throws Exception {
        TreeSet<String> versionList = new TreeSet<>();
        TreeSet<String> messageTypeList = new TreeSet<>();

        for (final File folderVersion : new File(DIRECTORY_FOR_HTML_FILES).listFiles()) {
            if(folderVersion.isFile()){
                throw new Exception("Wrong files structure. File should be directory: '"+folderVersion.getName()+"'");
            }
            List<Message> list=new ArrayList<>();
            for (final File fileType : folderVersion.listFiles()) {
                Message message = new Message();
                message.setVersion(getMessageVersion(folderVersion.getName()));
                message.setType(fileType.getName().replace(".html",""));
                message.setPathSourceFile(fileType.getAbsolutePath());
                message.setList(getObjectList(message));
                list.add(message);

                versionList.add(message.getVersion().toUpperCase());
                messageTypeList.add(message.getType().toUpperCase());
            }
            FileCreator fileCreator = new FileCreator(list);
            fileCreator.createAllClass();
        }
       for (String s : versionList) {
           System.out.println("public static final String "+s.toUpperCase()+" = \""+s.toLowerCase()+"\";");
        }

//        System.out.println("VersionList:");
//        System.out.println(String.join(",", versionList)+";");
//        System.out.println("MessageTypeList:");
//        System.out.println(String.join(",", messageTypeList)+";");
    }

    private static String getMessageVersion(String folderVersionName){
        folderVersionName = folderVersionName.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        boolean isNumeric = folderVersionName.chars().allMatch(Character::isDigit);
        if (isNumeric) {
            return "d" + folderVersionName;
        }
        return folderVersionName;
    }

    private static List<Object> getObjectList(Message message) throws IOException {
        List<Object> list = new ArrayList<>();
        addElement(list, Jsoup.parse(getSourceFile(message)).selectFirst("div#container div#view-message"));
        System.out.println(message.getVersion()+" "+message.getType());
        return list;
    }

    private static String getSourceFile(Message message) throws IOException {
        byte[] encoded = Files.readAllBytes(Paths.get(message.getPathSourceFile()));
        return new String(encoded, Charset.defaultCharset());
    }

    private static void addElement(List<Object> list, Element element) {
        for (Object object : element.childNodes()) {
            if (object instanceof Element) {
                Element el = (Element) object;
                if (el.attr("class").trim().equals("segment")) {
                    list.add(getSegment(el));
                } else if (el.attr("class").trim().equals("group")) {
                    list.add(getGroup(el));
                }
            }
        }
    }

    private static Group getGroup(Element element) {
        Group group = new Group();
        group.setId(element.selectFirst("span.tag_name").childNode(0).toString().trim());
        group.setName("SegmentGroup" + group.getId().replace("GRP", ""));

        String[] split = element.selectFirst("span.g_r").childNode(0).toString().trim().split(" ");
        if (split[0].trim().equalsIgnoreCase("M")) {
            group.setMandatory(true);
        }
        group.setMaxChild(Integer.valueOf(split[1]));
        try{
            group.setDescription(element.selectFirst("div.section_content div.header_purpose").textNodes().get(1).getWholeText().trim());
        }catch(java.lang.NullPointerException e){
            e.printStackTrace();
            group.setDescription("");
        }

        group.getList().addAll(getObjectsForGroup(element));
        return group;
    }

    private static List<Object> getObjectsForGroup(Element element) {
        List<Object> list = new ArrayList<>();
        addElement(list, element.selectFirst("div.standard"));
        return list;
    }

    private static Segment getSegment(Element element) {
        Segment segment = new Segment();
        segment.setId(element.selectFirst("span.tag_name").childNode(0).toString().trim());
        segment.setName(element.selectFirst("span.header_description_inner").childNode(0).toString().trim());

        String[] split = element.selectFirst("span.g_r").childNode(0).toString().trim().split(" ");
        if (split[0].trim().equalsIgnoreCase("M")) {
            segment.setMandatory(true);
        }
        segment.setMaxChild(Integer.valueOf(split[1]));
        segment.setDescription(element.selectFirst("div.section_content div.header_purpose").textNodes().get(1).getWholeText().trim());
        segment.getList().addAll(getSegmentField(element));
        return segment;
    }

    private static List<Object> getSegmentField(Element element) {
        List<Object> list = new ArrayList<>();

        Field field = null;
        Elements select = element.select("div.section_content div.standard");

        for (Element e1 : select) {
            for (Element el : e1.children()) {
                if (el.select("div.element div.level_header").size() > 0) {
                    if (field != null) {
                        list.add(field);
                        field = null;
                    }
                    field = getField(el);
                    continue;
                }
                if (el.select("div.level").size() > 0) {
                    field.getList().addAll(getComponentList(el));
                    continue;
                }
                if (el.select("div.element").size() > 0) {
                    if (field != null) {
                        list.add(field);
                        field = null;
                    }
                    list.add(getComponent(el));
                    continue;
                }
                if (field != null) {
                    list.add(field);
                    field = null;
                }
            }
            if (field != null) {
                list.add(field);
                field = null;
            }
        }
        return list;
    }

    private static Field getField(Element el) {
        Field field = new Field();
        field.setId(el.selectFirst("div.element_name").childNode(0).toString().trim());
        field.setName(el.selectFirst("div.element_description").childNode(0).toString().trim());
        field.setDescription(el.selectFirst("div.element_purpose").childNode(0).toString().trim());

        Elements e2 = el.select(" div.element_additional_info ul li");
        String isMandatory = e2.get(0).childNode(0).toString().trim();
        if (isMandatory.equalsIgnoreCase("Conditional")) {
            field.setMandatory(false);
        } else {
            field.setMandatory(true);
        }
        return field;
    }

    private static List<Component> getComponentList(Element el) {
        List<Component> list = new ArrayList<>();
        for (Element e2 : el.children()) {
            try{
                list.add(getComponent(e2));
            }catch(NullPointerException e) {
                System.out.println("");
            }
        }
        return list;
    }

    private static Component getComponent(Element el) {
        Component component = new Component();
        component.setId(el.selectFirst("div.element_name").childNode(0).toString().trim());
        component.setName(el.selectFirst("div.element_description").childNode(0).toString().trim());
        component.setDescription(el.selectFirst("div.element_purpose").childNode(0).toString().trim());

        Elements e2 = el.select(" div.element_additional_info ul li");
        String isMandatory = e2.get(0).childNode(0).toString().trim();
        if (isMandatory.equalsIgnoreCase("Conditional")) {
            component.setMandatory(false);
        } else {
            component.setMandatory(true);
        }
        String type = e2.get(1).childNode(0).toString().trim();
        if (type.equalsIgnoreCase("Type: an")) {
            component.setType("String");
        } else if (type.equalsIgnoreCase("Type: a")) {
            component.setType("String");
        } else if (type.equalsIgnoreCase("Type: n")) {
            component.setType("Decimal");
        }

        String lenght = e2.get(2).childNode(0).toString().trim();
        if (lenght.indexOf("..") > 0) {
            component.setMinLength(Integer.valueOf(lenght.substring(lenght.indexOf("Length: ") + 8, lenght.indexOf(".."))));
            component.setMaxLength(Integer.valueOf(lenght.substring(lenght.indexOf("Length: ") + 11)));
        } else {
            component.setMinLength(Integer.valueOf(lenght.substring(lenght.indexOf("Length: ") + 8)));
            component.setMaxLength(component.getMinLength());
        }
        return component;
    }


}
