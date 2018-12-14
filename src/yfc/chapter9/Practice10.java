package yfc.chapter9;

import yfc.chapter9.test5.Instrument;
import yfc.chapter9.test5.Playable;

public class Practice10 {

    static void tune(Playable i1){
        i1.play(true);
    }
    public static void main(String[] args) {
        tune(new Wind());
    }
}
