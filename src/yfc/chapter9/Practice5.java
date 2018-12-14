package yfc.chapter9;

import yfc.chapter9.test5.interface1;

public class Practice5 implements interface1 {
    @Override
    public void displayALL() {
        System.out.println(this);
    }

    @Override
    public void displayName() {
        System.out.println(this.getClass());
    }

    @Override
    public void displayClass() {
        System.out.println(this.getClass().getName());
    }

    public static void main(String[] args) {
        Practice5 p1 = new Practice5();
        p1.displayALL();
        p1.displayClass();
        p1.displayName();
    }
}
