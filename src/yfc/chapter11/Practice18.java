package yfc.chapter11;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Practice18 {
    public static void main(String[] args) {
        Map<String,Gerbil> map = new HashMap<>();
        map.put("Gerbil10000",new Gerbil());
        map.put("Gerbil2000",new Gerbil());
        map.put("Gerbil300",new Gerbil());
        map.put("Gerbil40",new Gerbil());
        map.put("Gerbil5",new Gerbil());

        Map<String,Gerbil> map1 = new TreeMap<>(map);
        System.out.println(map1);
    }
}
