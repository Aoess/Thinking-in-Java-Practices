package yfc.chapter10;

public class Sequence {

    private Object[] list;
    private int next = 0;

    public Sequence(int size) {
        this.list = new Object[size];
    }

    public void add(Object str) {
        if(next < list.length) {
            list[next++] = str;
        }
    }

    public void display() {
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }

    private class SequenceSelector implements Selector {

        private int i = 0;

        @Override
        public boolean end() {
            return i == list.length;
        }

        @Override
        public Object current() {
            return list[i];
        }

        @Override
        public void next() {
            if(i < list.length) {
                i++;
            }
        }

        public Sequence getSequence() {
            return Sequence.this;
        }
    }

    public Selector reverseSelector() {
        return new Selector() {
            private int i = list.length;
            @Override
            public boolean end() {
                return i == 0;
            }

            @Override
            public Object current() {
                return list[i];
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
