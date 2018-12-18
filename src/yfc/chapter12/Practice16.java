package yfc.chapter12;

public class Practice16 {

    public static void exception() {
        throw new RuntimeException();
    }

    public static void main(String[] args) {
        test16_g1 t1 = new test16_g1();
        try{
            t1.setWork(true);
            t1.setSw(true);
            System.out.println(t1);
            exception();
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            t1.close();
        }
    }
}

class test16_g1 {
    boolean sw = false;
    boolean work = false;

    public boolean isSw() {
        return sw;
    }

    public void setSw(boolean sw) {
        this.sw = sw;
    }

    public boolean isWork() {
        return work;
    }

    public void setWork(boolean work) {
        this.work = work;
    }

    @Override
    public String toString() {
        return "test16_g1{" +
                "sw=" + sw +
                ", work=" + work +
                '}';
    }

    public void close() {
        setSw(false);
        setWork(false);
        System.out.println(this);
    }
}

