package yfc.chapter10;

public class Out {

    private String str;

    public Out(String str) {
        this.str = str;
    }

    protected class Inner {

        public Inner() {
        }

        @Override
        public String toString() {
            return "Inner{}";
        }
        public void displayBaBaName(){
            System.out.println(str);
        }
    }

    public Inner getInner(){
        return new Inner();
    }
}
