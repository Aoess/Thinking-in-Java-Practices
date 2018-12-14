package yfc.chapter11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Sequence2 {

    private List<Object> list = new ArrayList<Object>();
    private int next = 0;

    public void add(Object str) {
        list.add(str);
    }

    public void display() {
        System.out.println(list);
    }

    private class SequenceSelector implements Iterable {

        public Sequence2 getSequence() {
            return Sequence2.this;
        }

        @Override
        public Iterator iterator() {
            return list.iterator();
        }
    }

    public SequenceSelector Iterable() {
        return new SequenceSelector();
    }
}

