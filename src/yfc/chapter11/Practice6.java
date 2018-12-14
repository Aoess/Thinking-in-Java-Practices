package yfc.chapter11;

import java.util.*;
import java.util.function.Consumer;

public class Practice6 {

    public static void main(String[] args) {
        Random random = new Random(47);
        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList(Generator_String.sublist(0,8)));
        System.out.println("1: " + list);
        list.add("喵喵");
        System.out.println("2: " + list);
        System.out.println("3: " + list.contains(8));
        list.remove(new Integer(8));
        String a = list.get(2);
        System.out.println("4: " + a + " " + list.indexOf(a));
        String b = new String("铁甲犀牛");
        System.out.println("5: " + list.indexOf(b));
        System.out.println("6: " + list.remove(b));
        System.out.println("7: " + list.remove(a));
        System.out.println("8: " + list);
        list.add(3,"蚊香蛙");
        System.out.println("9: " + list);
        List<String> sublist = list.subList(1,4);
        System.out.println("sulist: " + sublist);
        System.out.println("10: " + list.containsAll(sublist));
        Collections.sort(sublist);
        System.out.println("sort list: " + sublist);
        System.out.println("11: " + list.containsAll(sublist));
        Collections.shuffle(sublist,random);
        System.out.println("shuffle sublist: " + sublist);
        System.out.println("12: " + list.containsAll(sublist));
        List<String> copylist = new ArrayList<>(list);
        sublist = Arrays.asList(list.get(1),list.get(4));
        System.out.println("sublist: " + sublist);
        copylist.retainAll(sublist);
        System.out.println("13: " + copylist);
        copylist = new ArrayList<>(list);
        copylist.remove(2);
        System.out.println("14: " + copylist);
        copylist.removeAll(sublist);
        System.out.println("15: " + copylist);
        copylist.set(1, "可达鸭");
        System.out.println("16: " + copylist);
        copylist.addAll(2,sublist);
        System.out.println("17: " + copylist);
        System.out.println("18: " + list.isEmpty());
        list.clear();
        System.out.println("19: " + list);
        System.out.println("20: " + list.isEmpty());
        list.addAll(Arrays.asList(Generator_String.sublist(0,4)));
        System.out.println("21: " + list);
        Object[] o = list.toArray();
        System.out.println("22: " + o[3]);
        String[] i = list.toArray(new String[0]);
        System.out.println("23: " + i[3]);
    }
}

class Generator_String implements Iterable<String>{

    private static String[] strlist = {"皮卡丘","小火龙","妙蛙种子","卡蒂狗","卡比兽","小火马","伊布"};
    private static int i = 0;
    public static String next() {
        return strlist[i++ % 7];
    }
    public static String[] sublist(int start, int end) {
        if(start < 0){
            start = 0;
        }
        String[] temp = new String[end-start];
        for(int i = 0; i < temp.length; i++) {
            temp[i] = next();
        }
        return temp;
    }

    @Override
    public Iterator iterator() {
        return new Iterator() {
            private int i = 0;
            @Override
            public boolean hasNext() {
                return i == strlist.length ? false : true;
            }

            @Override
            public String next() {
                return strlist[i++];
            }
        };
    }

    @Override
    public void forEach(Consumer action) {

    }
}

