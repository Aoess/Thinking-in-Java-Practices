package yfc.chapter11;

import java.util.Iterator;

public class Practice9 {

    public static void main(String[] args) {
        Sequence2 s2 = new Sequence2();
        s2.add("i");
        s2.add("love");
        s2.add("xu");
        s2.add("jing");
        Iterable iterable = s2.Iterable();
        Iterator itera = iterable.iterator();
        while(itera.hasNext()) {
            System.out.println(itera.next());
        }
    }
}
