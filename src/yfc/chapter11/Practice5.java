package yfc.chapter11;

import java.util.*;

public class Practice5 {

    public static void main(String[] args) {
        Random random = new Random(47);
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(Generator_Ingeter.sublist(0,8)));
        System.out.println("1: " + list);
        list.add(8);
        System.out.println("2: " + list);
        System.out.println("3: " + list.contains(8));
        list.remove(new Integer(8));
        Integer a = list.get(2);
        System.out.println("4: " + a + " " + list.indexOf(a));
        Integer b = new Integer(3);
        System.out.println("5: " + list.indexOf(b));
        System.out.println("6: " + list.remove(b));
        System.out.println("7: " + list.remove(a));
        System.out.println("8: " + list);
        list.add(3,new Integer("3"));
        System.out.println("9: " + list);
        List<Integer> sublist = list.subList(1,4);
        System.out.println("sulist: " + sublist);
        System.out.println("10: " + list.containsAll(sublist));
        Collections.sort(sublist);
        System.out.println("sort list: " + sublist);
        System.out.println("11: " + list.containsAll(sublist));
        Collections.shuffle(sublist,random);
        System.out.println("shuffle sublist: " + sublist);
        System.out.println("12: " + list.containsAll(sublist));
        List<Integer> copylist = new ArrayList<>(list);
        sublist = Arrays.asList(list.get(1),list.get(4));
        System.out.println("sublist: " + sublist);
        copylist.retainAll(sublist);
        System.out.println("13: " + copylist);
        copylist = new ArrayList<>(list);
        copylist.remove(2);
        System.out.println("14: " + copylist);
        copylist.removeAll(sublist);
        System.out.println("15: " + copylist);
        copylist.set(1, 10);
        System.out.println("16: " + copylist);
        copylist.addAll(2,sublist);
        System.out.println("17: " + copylist);
        System.out.println("18: " + list.isEmpty());
        list.clear();
        System.out.println("19: " + list);
        System.out.println("20: " + list.isEmpty());
        list.addAll(Arrays.asList(Generator_Ingeter.sublist(0,4)));
        System.out.println("21: " + list);
        Object[] o = list.toArray();
        System.out.println("22: " + o[3]);
        Integer[] i = list.toArray(new Integer[0]);
        System.out.println("23: " + i[3]);
    }
}
class Generator_Ingeter {

    private static int[] intlist = {3,1,4,1,5,9,2,6};
    private static int i = 0;
    public static int next() {
        return intlist[i++ % 7];
    }
    public static Integer[] sublist(int start, int end) {
        if(start < 0){
            start = 0;
        }
        if(end >= intlist.length){
            end = intlist.length;
        }
        Integer[] temp = new Integer[end-start];
        for(int i = 0; i < temp.length; i++) {
            temp[i] = next();
        }
        return temp;
    }
}

