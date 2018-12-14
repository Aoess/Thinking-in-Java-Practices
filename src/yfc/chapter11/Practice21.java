package yfc.chapter11;

import java.util.*;

public class Practice21 {

    public static void main(String[] args) {
        String[] strlist = Generator_String.sublist(0,20);
        System.out.println(Arrays.toString(strlist));
        Map<String,Integer> map = new HashMap<>();
        for(int i = 0; i < strlist.length; i++) {
            if(map.get(strlist[i]) == null) {
                map.put(strlist[i],0);
            }
            Integer ii = map.get(strlist[i]);
            map.put(strlist[i],++ii);
        }
        System.out.println(map);
        Map<String,Integer> treemap = new TreeMap<>(map);
        System.out.println(treemap);
        List<String> entries = new ArrayList<>(map.keySet());
        System.out.println(entries);
        Collections.sort(entries,String.CASE_INSENSITIVE_ORDER);
        System.out.println(entries);
    }
}
