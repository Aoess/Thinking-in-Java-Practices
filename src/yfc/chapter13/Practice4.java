package yfc.chapter13;

import java.util.Formatter;

public class Practice4 {

    private Formatter f = new Formatter(System.out);
    private static int width1 = -15;
    private static int width2 = 5;
    private static int width3 = 10;

    public void print(String name, int qrt, double price) {
        f.format("%"+width1+"s %"+width2+"s %"+width3+"s\n",name,qrt,price);
    }

    public static void main(String[] args) {
        Practice4 p1 = new Practice4();
        p1.print("燕富成爱徐静",4,4.25);
    }
}
