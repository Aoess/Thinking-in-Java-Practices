package yfc.chapter10.test6_2;

import yfc.chapter10.test6_1.interfacer;

public class test6 {

    protected class neibu_test implements interfacer {

        public neibu_test() {
        }

        @Override
        public void callMeBaby() {
            System.out.println("i am test6 is neibu_test");
        }
    }

    protected String name = "aixujing";

}
