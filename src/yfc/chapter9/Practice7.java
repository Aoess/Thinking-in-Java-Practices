package yfc.chapter9;

import yfc.chapter9.test5.Rodent_Interface;

public class Practice7 implements Rodent_Interface{

    public static void main(String[] args) {
        Practice7 p1 = new Practice7();
        p1.eat();
    }

    @Override
    public void eat() {
        System.out.println("test7 eat");
    }
}
