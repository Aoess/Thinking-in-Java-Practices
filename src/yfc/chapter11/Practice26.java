package yfc.chapter11;

import java.util.*;

public class Practice26 {

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
        Map<Integer,String> strmap = new TreeMap<>();
        for (Map.Entry<String, ArrayList<Integer>> entry : map.entrySet()) {
            List<Integer> list = entry.getValue();
            for (int i = 0; i < list.size(); i++) {
                strmap.put(list.get(i),entry.getKey());
            }
        }
        System.out.println(strmap);
    }
}
