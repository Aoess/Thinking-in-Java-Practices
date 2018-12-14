package yfc.chapter7;

public class Superclass extends Baseclass{

    static {
        System.out.println(name);
        System.out.println("Superclass 被加载");
        name = "Superclass";
    }

    public Superclass() {
        System.out.println("Superclass 初始化");
    }

    @Override
    public String toString() {
        return "Superclass{"+name+"}";
    }
}
