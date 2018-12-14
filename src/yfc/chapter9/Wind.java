package yfc.chapter9;

import yfc.chapter9.test5.Instrument;
import yfc.chapter9.test5.Playable;

public class Wind implements Instrument,Playable {

    @Override
    public void play(boolean flag) {
        System.out.println(this + " playable_play() " + flag);
    }

    @Override
    public void play(String str) {
        System.out.println(this + " Instrument_play() " + str);
    }

    @Override
    public void adjust() {
        System.out.println(this + " adjust() ");
    }

    @Override
    public String toString(){
        return "Wind";
    }
}
