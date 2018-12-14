package yfc.chapter11;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Practice14 {

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<Integer>();
        ListIterator<Integer> iterator = list.listIterator();
        for(int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println(list);
    }
}
