package yfc.chapter11;

import sun.security.util.Cache;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;

public class Practice23 {

    public static void main(String[] args) {
        Random rand = new Random(47);
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < 1000; i++) {
            int ii = rand.nextInt(10);
            Integer frq = map.get(ii);
            map.put(ii,frq == null? 1 : ++frq);
        }
        System.out.println(map);
    }
}
