package yfc.chapter10;

public class Practice1 {

    public static void main(String[] args) {
        Out o1 = new Out("");
        Out.Inner inner = o1.getInner();
        System.out.println(inner);
    }
}
