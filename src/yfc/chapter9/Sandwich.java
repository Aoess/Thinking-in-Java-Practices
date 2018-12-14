package yfc.chapter9;

import yfc.chapter9.test5.FastFood;

public class Sandwich implements FastFood{

    private String name = "Sandwich";
    private double fat = 100.1;

    @Override
    public void fat() {
        System.out.println("fat = " + fat);
    }

    @Override
    public void name() {
        System.out.println("name = " + name);
    }

    @Override
    public void like(boolean like) {
        if(like){
            System.out.println("I like " + name + " very much!");
        }else{
            System.out.println("I do not like " + name);
        }
    }
}
