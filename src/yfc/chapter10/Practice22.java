package yfc.chapter10;

public class Practice22 {
    public static void main(String[] args) {
        Sequence s1 = new Sequence(3);
        s1.add("i");
        s1.add("love");
        s1.add("xujing");
        Selector selector = s1.reverseSelector();
        while(!selector.end()){
            selector.next();
            System.out.println(selector.current());
        }
    }
}
