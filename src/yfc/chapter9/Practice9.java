package yfc.chapter9;

import yfc.chapter9.test5.Instrument;

public class Practice9 {
    static void tune(Instrument i1){
        i1.play("爱徐静");
    }
    public static void main(String[] args) {
        tune(new Wind());
    }
}


