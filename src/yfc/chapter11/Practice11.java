package yfc.chapter11;

import java.util.*;

public class Practice11 {

    public static void displayCollection(Iterator iterator) {
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    public static void main(String[] args) {
        System.out.println("ArrayList----------");
        Collection<String>  c = new ArrayList<String>();
        c.addAll(Arrays.asList(Generator_String.sublist(0,10)));
        displayCollection(c.iterator());
        System.out.println("HashSet-----------");
        c = new HashSet<String>();
        c.addAll(Arrays.asList(Generator_String.sublist(0,10)));
        displayCollection(c.iterator());
    }
}


