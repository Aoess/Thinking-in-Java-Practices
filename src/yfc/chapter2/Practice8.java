package yfc.chapter2;

public class Practice8 {

    public static void main(String[] args) {
        StaticTest st1 = new StaticTest();
        System.out.println(st1.i);
        st1.i++;
        System.out.println(st1.i);
        StaticTest st2 = new StaticTest();
        System.out.println(st2.i);
    }
}
