package yfc.chapter11;

import java.util.Iterator;

public class Practice31 {

    public static void main(String[] args) {
        Generator_String g1 = new Generator_String();
        for (String o : g1) {
            System.out.println(o);
        }
//        Iterator iterator = g1.iterator();
//        while(!iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
    }
}
