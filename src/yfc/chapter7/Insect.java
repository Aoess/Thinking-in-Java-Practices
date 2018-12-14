package yfc.chapter7;

public class Insect {
    private int i = 9;
    protected int j;
    Insect(){
        System.out.println(i + " " + j);
        j = 39;
    }
    private static int x1 = printInt("static Insct x1 initialized");

    static int printInt(String str) {
        System.out.println(str);
        return 47;
    }
}
