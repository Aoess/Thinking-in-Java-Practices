package yfc.chapter11;

public class Generator {

    private static String[] strlist = {"皮卡丘","小火龙","妙蛙种子","卡蒂狗","卡比兽","小火马","伊布"};
    private static int i = 0;
    public static String next() {
        return strlist[i++ % 7];
    }
}
