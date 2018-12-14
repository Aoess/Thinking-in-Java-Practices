package yfc.chapter11;

import java.util.*;

public class Practice24 {

    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("yanfucheng","shuai");
        map.put("xujing","mei");
        map.put("baba","qiang");
        map.put("mam","ai");
        System.out.println(map);
        List<Map.Entry<String, String>> entries = new ArrayList<>(map.entrySet());
        Collections.sort(entries, new Comparator<Map.Entry<String, String>>() {
            @Override
            public int compare(Map.Entry<String, String> o1, Map.Entry<String, String> o2) {

                return o1.getKey().compareTo(o2.getKey());
            }
        });
        for(Map.Entry<String,String> mapping:entries){
            System.out.println(mapping.getKey()+":"+mapping.getValue());
        }
    }

}
