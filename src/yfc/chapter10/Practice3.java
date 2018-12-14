package yfc.chapter10;

public class Practice3 {

    public static void main(String[] args) {
        Out o1 = new Out("i love xu jing");
        Out.Inner inner = o1.getInner();
        inner.displayBaBaName();
    }
}
