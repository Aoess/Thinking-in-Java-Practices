package yfc.chapter11;

import java.util.LinkedList;

public class Practice15 {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.addFirst("U");
        list.addFirst("n");
        list.addFirst("c");
        System.out.println(list.removeFirst());
        System.out.println(list.removeFirst());
        System.out.println(list.removeFirst());
        list.addFirst("e");
        list.addFirst("r");
        list.addFirst("t");
        System.out.println(list.removeFirst());
        System.out.println(list.removeFirst());
        System.out.println(list.removeFirst());
        list.addFirst("a");
        System.out.println(list.removeFirst());
        list.addFirst("i");
        System.out.println(list.removeFirst());
        list.addFirst("n");
        list.addFirst("t");
        list.addFirst("y");
        System.out.println(list.removeFirst());
        System.out.println(list.removeFirst());
        System.out.println(list.removeFirst());
        list.addFirst("");
        System.out.println(list.removeFirst());
        list.addFirst("r");
        list.addFirst("u");
        System.out.println(list.removeFirst());
        list.addFirst("l");
        list.addFirst("e");
        list.addFirst("s");
        System.out.println(list.removeFirst());
        System.out.println(list.removeFirst());
        System.out.println(list.removeFirst());

    }
}
