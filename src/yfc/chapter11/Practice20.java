package yfc.chapter11;

import java.util.*;

public class Practice20 {

    public static void main(String[] arsg) {
        Map<String,Integer> map = new HashMap<>();
        map.put("a",0);
        map.put("e",0);
        map.put("i",0);
        map.put("o",0);
        map.put("u",0);
        List<String> list = new ArrayList<String>();
        String[] strings = "fdhfajdjfkldahfdhakfiruiodj".split("");
        int count = 0;
        for (String string : strings) {
            if(map.containsKey(string)){
                count++;
                int i = map.get(string);
                map.put(string,++i);
            }
            list.add(string);
        }
        System.out.println(list);
        System.out.println(count);
        System.out.println(map);

    }
}
