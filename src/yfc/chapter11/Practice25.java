package yfc.chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Practice25 {

    public static void main(String[] args) {
        String[] strlist = Generator_String.sublist(0,20);
        System.out.println(Arrays.toString(strlist));
        Map<String,ArrayList<Integer>> map = new HashMap<>();
        for(int i = 0; i < strlist.length; i++) {
            ArrayList<Integer> ii = map.get(strlist[i]);
            if(ii == null) {
                ii = new ArrayList<Integer>();
                ii.add(i);
                map.put(strlist[i],ii);
            }else{
                ii.add(i);
            }
        }
        System.out.println(map);
    }
}
