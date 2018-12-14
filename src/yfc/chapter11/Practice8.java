package yfc.chapter11;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Practice8 {

    public static void main(String[] args) {
        List<Gerbil> list = new ArrayList<Gerbil>();
        for(int i = 0; i < 10; i++) {
            list.add(new Gerbil());
        }
        ListIterator<Gerbil> iterator = list.listIterator();
        while(iterator.hasNext()){
            iterator.next().hop();
        }
    }
}
