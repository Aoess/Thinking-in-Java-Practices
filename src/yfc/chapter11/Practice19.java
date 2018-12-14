package yfc.chapter11;

import java.util.*;

public class Practice19 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("Gerbil10000");
        set.add("Gerbil2000");
        set.add("Gerbil300");
        set.add("Gerbil40");
        set.add("Gerbil5");
        System.out.println(set);
        Set<String> set1 = new TreeSet<>(set);
        System.out.println(set1);
        Set<String> set2 = new LinkedHashSet<>(set1);
        System.out.println(set2);
    }
}
