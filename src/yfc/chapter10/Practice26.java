package yfc.chapter10;

public class Practice26{

    class Practice26_inner extends Outer1.inner1 {

        public Practice26_inner(Outer1 o1,String name) {
            o1.super(name);
        }

        public Practice26_inner(String name) {
            this(new Outer1(),name);
        }
    }

    public static void main(String[] args) {
        Practice26 p1 = new Practice26();
        Practice26.Practice26_inner pi = p1.new Practice26_inner("爱徐静");
    }
}


