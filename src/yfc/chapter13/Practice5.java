package yfc.chapter13;

import java.util.Formatter;

public class Practice5 {

    public static void main(String[] args) {
        Formatter f = new Formatter(System.out);
        f.format("%d %c %b %s %f %e %x %h",10,'A',true,"爱徐静",0.01,1e1,0x2,0x10);
    }
}
