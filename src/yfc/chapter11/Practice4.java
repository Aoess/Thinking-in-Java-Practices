package yfc.chapter11;

import java.util.*;

public class Practice4 {
    public static void main(String[] args) {
        Collection<String> set = new HashSet<String>();
        for(int i = 0; i < 8; i++) {
            set.add(Generator.next());
        }
        System.out.println(set);
        Collection<String> list = new ArrayList<>();
        for(int i = 0; i < 8; i++) {
            list.add(Generator.next());
        }
        System.out.println(list);
        Collection<String> treeSet = new TreeSet<String>();
        for(int i = 0; i < 8; i++) {
            treeSet.add(Generator.next());
        }
        System.out.println(treeSet);
        Collection<String> linkedlist = new LinkedList<>();
        for(int i = 0; i < 8; i++) {
            linkedlist.add(Generator.next());
        }
        System.out.println(linkedlist);

    }
}
