package yfc.chapter11;

public class Practice3 {
    public static void main(String[] args) {
        Sequence s1 = new Sequence();
        s1.add("hao");
        s1.add("hao");
        s1.add("xue");
        s1.add("xi");
        s1.add("tian");
        s1.add("tian");
        s1.add("xiang");
        s1.add("shang");

        s1.display();
        Selector selector = s1.selector();
        while(!selector.end()){

            System.out.println(selector.current());
            selector.next();
        }
    }
}
