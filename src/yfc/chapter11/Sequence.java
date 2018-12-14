package yfc.chapter11;

import java.util.ArrayList;
import java.util.List;

public class Sequence {

    private List<Object> list = new ArrayList<Object>();
    private int next = 0;

    public void add(Object str) {
        list.add(str);
    }

    public void display() {
        System.out.println(list);
    }

    private class SequenceSelector implements Selector {

        private int i = 0;

        @Override
        public boolean end() {
            return i == list.size();
        }

        @Override
        public Object current() {
            return list.get(i);
        }

        @Override
        public void next() {
            if(i < list.size()) {
                i++;
            }
        }

        public Sequence getSequence() {
            return Sequence.this;
        }
    }

    public Selector reverseSelector() {
        return new Selector() {
            private int i = list.size();
            @Override
            public boolean end() {
                return i == 0;
            }

            @Override
            public Object current() {
                return list.get(i);
            }

            @Override
            public void next() {
                if(i >= 0) {
                    i--;
                }
            }
        };
    }

    public Selector selector() {
        return new SequenceSelector();
    }
}

interface Selector {
    boolean end();
    Object current();
    void next();
}
