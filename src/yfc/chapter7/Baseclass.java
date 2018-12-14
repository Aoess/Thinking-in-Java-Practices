package yfc.chapter7;

public class Baseclass {

    protected static String name = "Baseclass";

    static {
        System.out.println("Baseclass 被加载");
    }

    public Baseclass() {
        System.out.println("Baseclass 初始化");
    }
}
