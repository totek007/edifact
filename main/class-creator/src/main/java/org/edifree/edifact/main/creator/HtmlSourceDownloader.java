package org.edifree.edifact.main.creator;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class HtmlSourceDownloader {

    static class ProxyTemp {
        String server;
        int port;

        public ProxyTemp(String server, int port) {
            this.server = server;
            this.port = port;
        }
    }

    public static File FOLDER_FILE = new File("download");
    public static List<ProxyTemp> list = new ArrayList<>();

    public static void main(String[] args) throws IOException, InterruptedException {
        Document document = Jsoup.connect("https://free-proxy-list.net").cookies(new HashMap<>()).timeout(30000).get();

        String server = null;
        int port;

        for (Element element : document.select("tr td")) {
            System.out.println(element);
            if(element.childNodes().size()==0){
                continue;
            }
            String el = element.childNode(0).toString().trim();
            if (el.contains(".")) {
                server = el;
                continue;
            }
            try {
                port = Integer.valueOf(el);
            } catch (NumberFormatException e) {
                port = 0;
                continue;
            }

            if (port > 0) {
                list.add(new ProxyTemp(server, port));
                server = null;
            }
        }
        new HtmlSourceDownloader().getAllMessageType();
    }


    private void getAllMessageType() throws IOException, InterruptedException {

        boolean run = true;
        while (run) {
            try {
                Document document = Jsoup.connect("http://www.truugo.com/edifact/").proxy(list.get(0).server, list.get(0).port).cookies(new HashMap<>()).timeout(30000).get();
                Elements select = document.select("div#view-index h3 a");
                if(select.size()<=0){
                    throw new Exception("Empty elements- wrong response catch for proxy");
                }
                for (Element element : select) {
                    System.out.println(element.attr("name"));

                    if (element.attr("name").equals("91.1")) {
                        continue;
                    } else if (element.attr("name").equals("91.2")) {
                        continue;
                    } else if (element.attr("name").equals("92.1")) {
                        continue;
                    } else if (element.attr("name").equals("93.2")) {
                        continue;
                    } else if (element.attr("name").equals("S.93A")) {
                        continue;
                    } else if (element.attr("name").equals("D.93A")) {
                        continue;
                    } else if (element.attr("name").equals("D.94A")) {
                        continue;
                    } else if (element.attr("name").equals("D.94B")) {
                        continue;
                    } else if (element.attr("name").equals("D.95A")) {
                        continue;
                    } else if (element.attr("name").equals("D.95B")) {
                        continue;
                    } else if (element.attr("name").equals("D.96A")) {
                        continue;
                    } else if (element.attr("name").equals("D.96B")) {
                        continue;
                    } else if (element.attr("name").equals("D.97A")) {
                        continue;
                    } else if (element.attr("name").equals("D.97B")) {
                        continue;
                    } else if (element.attr("name").equals("D.98A")) {
                        continue;
                    } else if (element.attr("name").equals("D.98B")) {
                        continue;
                    } else if (element.attr("name").equals("D.99A")) {
                        continue;
                    } else if (element.attr("name").equals("D.99B")) {
                        continue;
                    } else if (element.attr("name").equals("D.00A")) {
                        continue;
                    } else if (element.attr("name").equals("D.00B")) {
                        continue;
                    } else if (element.attr("name").equals("D.01A")) {
                        continue;
                    } else if (element.attr("name").equals("D.01B")) {
                        continue;
                    } else if (element.attr("name").equals("D.01C")) {
                        continue;
                    } else if (element.attr("name").equals("D.02A")) {
                        continue;
                    } else if (element.attr("name").equals("D.02B")) {
                        continue;
                    } else if (element.attr("name").equals("D.03A")) {
                        continue;
                    } else if (element.attr("name").equals("D.03B")) {
                        continue;
                    } else if (element.attr("name").equals("D.04A")) {
                        continue;
                    } else if (element.attr("name").equals("D.04B")) {
                        continue;
                    } else if (element.attr("name").equals("D.05A")) {
                        continue;
                    } else if (element.attr("name").equals("D.05B")) {
                        continue;
                    } else if (element.attr("name").equals("D.06A")) {
                        continue;
                    } else if (element.attr("name").equals("D.06B")) {
                        continue;
                    } else if (element.attr("name").equals("D.07A")) {
                        continue;
                    } else if (element.attr("name").equals("D.07B")) {
                        continue;
                    } else if (element.attr("name").equals("D.08A")) {
                        continue;
                    } else if (element.attr("name").equals("D.08B")) {
                        continue;
                    } else if (element.attr("name").equals("D.09A")) {
                        continue;
                    } else if (element.attr("name").equals("D.09B")) {
                        continue;
                    } else if (element.attr("name").equals("D.10A")) {
                        continue;
                    } else if (element.attr("name").equals("D.10B")) {
                        continue;
                    } else if (element.attr("name").equals("D.11A")) {
                        continue;
                    } else if (element.attr("name").equals("D.11B")) {
                        continue;
                    } else if (element.attr("name").equals("D.12A")) {
                        continue;
                    } else if (element.attr("name").equals("D.12B")) {
                        continue;
                    } else if (element.attr("name").equals("D.13A")) {
                        continue;
                    } else if (element.attr("name").equals("D.13B")) {
                        continue;
                    } else if (element.attr("name").equals("D.14A")) {
                        continue;
                    } else if (element.attr("name").equals("D.14B")) {
                        continue;
                    }
// else if (element.attr("name").equals("D.15A")) {
//                        continue;
//                    } else if (element.attr("name").equals("D.15B")) {
//                        continue;
//                    } else if (element.attr("name").equals("D.16A")) {
//                        continue;
//                    }


                    getAllMessage(element.attr("href"), element.attr("name"));
                }
                run = false;
            } catch (Exception e) {
                System.out.println("BLAD");
                list.remove(0);
                if (list.size() > 0) {
                    run = true;
                }
            }
        }
        System.out.println("Koniec. Zostało proxy :"+list.size());


    }

    private void getAllMessage(String versionHref, String versionName) throws IOException, InterruptedException {
        boolean run = true;
        while (run) {
            try {
                Document document = Jsoup.connect("http://www.truugo.com" + versionHref).proxy(list.get(0).server, list.get(0).port).cookies(new HashMap<>()).timeout(30000).get();
                File versionFolder = new File(FOLDER_FILE, versionName);
                if (!versionFolder.exists()) {
                    versionFolder.mkdirs();
                }

                for (Element element : document.select("div.messages ul li a")) {
                    System.out.println(element.childNode(0).toString().trim().toLowerCase());

                    File messageFile = new File(versionFolder, element.childNode(0).toString().trim().toLowerCase() + ".html");

                    if(messageFile.exists() && messageFile.length() < 1400000 && messageFile.length()>0){
                        //System.out.println(messageFile.length());
                        continue;
                    }
                    SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
                    String newLastModified = "04/12/2018";
                    Date newDate = sdf.parse(newLastModified);
                    if(messageFile.lastModified()>newDate.getTime() && messageFile.length()>0){
                        continue;
                    }



                    try (FileOutputStream fStream = new FileOutputStream(messageFile);
                         DataOutputStream dataOutputStreama = new DataOutputStream(fStream)) {
                        boolean run2 = true;
                        while (run2) {
                            try {
                                dataOutputStreama.write(SocketConnection.getURLSource(element.baseUri() + element.attr("href"),list.get(0)).getBytes());
                                run2 = false;
                            } catch (Exception ex) {
                                System.out.println("BLAD3");
                                list.remove(0);
                                if (list.size() > 0) {
                                    run2 = true;
                                }
                            }

                        }
                        //TimeUnit.SECONDS.sleep(20);
                    }
                }
                run = false;
            } catch (Exception e2) {
                System.out.println("BLAD2");
                list.remove(0);
                if (list.size() > 0) {
                    run = true;
                }
            }


        }}
    }
