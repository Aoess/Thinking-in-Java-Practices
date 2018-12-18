package yfc.chapter12;

import static yfc.chapter12.Practice16.exception;

public class Practice17 {
    public static void main(String[] args) {
        test17 t1 = new test17();
        try {
            t1.setSw(true);
            t1.setWork(true);
            t1.setWorkcounter(true);
            System.out.println(t1);
            exception();
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            t1.close();
        }
    }
}

class test17 extends test16_g1 {

    boolean workcounter = false;

    public boolean isWorkcounter() {
        return workcounter;
    }

    public void setWorkcounter(boolean workcounter) {
        this.workcounter = workcounter;
    }

    @Override
    public String toString() {
        return "test17{" +
                "workcounter=" + workcounter +
                ", sw=" + sw +
                ", work=" + work +
                '}';
    }

    @Override
    public void close() {
        setWorkcounter(false);
        super.close();
    }
}
