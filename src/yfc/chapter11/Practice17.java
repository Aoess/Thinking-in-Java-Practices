package yfc.chapter11;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Practice17 {
    public static void main(String[] args) {
        Map<String,Gerbil> map = new HashMap<>();
        map.put("Gerbil1",new Gerbil());
        map.put("Gerbil2",new Gerbil());
        map.put("Gerbil3",new Gerbil());
        map.put("Gerbil4",new Gerbil());
        map.put("Gerbil5",new Gerbil());

        Set<Map.Entry<String, Gerbil>> entries = map.entrySet();
        for (Map.Entry<String, Gerbil> entry : entries) {
            entry.getValue().hop();
        }
    }
}
