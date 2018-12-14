package yfc.chapter11;

import java.util.*;

public class Practice16 {

    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.addAll(Arrays.asList("aeiou".split("")));
        List<String> list = new ArrayList<String>();
        String[] strings = "fdhfajdjfkldahfdhakfiruiodj".split("");
        int count = 0;
        for (String string : strings) {
            if(set.contains(string)){
                count++;
            }
            list.add(string);
        }
        System.out.println(list);
        System.out.println(count);
    }
}
