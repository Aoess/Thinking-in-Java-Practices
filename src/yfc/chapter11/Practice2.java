package yfc.chapter11;

import java.util.Collection;
import java.util.HashSet;

public class Practice2 {

    public static void main(String[] args) {
        Collection<Integer> c = new HashSet<Integer>();
        for(int i = 0; i < 10; i++) {
            c.add(10-i);
        }
        System.out.println(c);
    }
}
