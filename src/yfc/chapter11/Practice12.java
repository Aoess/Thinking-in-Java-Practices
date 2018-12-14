package yfc.chapter11;

import java.util.*;

public class Practice12 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.addAll(Arrays.asList(Generator_String.sublist(0,10)));
        System.out.println("list-------------------------");
        Practice11.displayCollection(list.iterator());
        System.out.println("-----------------------------");
        List<String> list2 = new ArrayList<String>(list.size());
        ListIterator<String> iterator = list.listIterator();
        while(iterator.hasNext()) {
            String next = iterator.next();
            list2.add(0,next);
        }
        System.out.println("list2-------------------------");
        Practice11.displayCollection(list2.iterator());
        System.out.println("-----------------------------");
    }
}
