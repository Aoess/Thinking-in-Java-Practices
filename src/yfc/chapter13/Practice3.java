package yfc.chapter13;

import java.util.Formatter;

public class Practice3 {

    private String name;
    private Formatter f;

    public Practice3(String name, Formatter f) {
        this.name = name;
        this.f = f;
    }
    public void move(int x, int y) {
        f.format("%s is at (%d,%d)",name,x,y);
    }

    public static void main(String[] args) {
        Practice3 p1 = new Practice3("燕富成",new Formatter(System.err));
        p1.move(1,1);
    }
}
