package org.edifree.edifact.main.creator.objects;

public class Counter {
    private int countShouldBe;
    private int countIs;

    public Counter() {
        countShouldBe =1;
    }

    public void increaseShouldBeCounter(){
        countShouldBe++;
    }

    public int increaseIsCounter(){
        countIs++;
        if(countIs>countShouldBe){
            System.out.println("!!!FATAL_ERROR");
        }
        if(countShouldBe>1){
            return countIs;
        }
        return 0;
    }


}
