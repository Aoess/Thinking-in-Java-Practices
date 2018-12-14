package yfc.chapter11;

import java.util.Iterator;
import java.util.function.Consumer;

public class Practice32 {

    public static void main(String[] args) {
        NonCollectionSequence n1 = new NonCollectionSequence();
        for (String o : n1.resiterator()) {
            System.out.println(o);
        }
    }
}

class NonCollectionSequence implements Iterable<String>{
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
    public Iterator<String> iterator() {
        return new Iterator<String>() {
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

    public Iterable<String> resiterator() {
        return new Iterable<String>() {
            @Override
            public Iterator<String> iterator() {
                return new Iterator<String>() {
                    private int i = strlist.length-1;
                    @Override
                    public boolean hasNext() {
                        return i < 0 ? false : true;
                    }

                    @Override
                    public String next() {
                        return strlist[i--];
                    };
                };
            }
        };
    }

    @Override
    public void forEach(Consumer action) {

    }
}