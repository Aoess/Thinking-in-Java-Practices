package yfc.chapter2;

public class DataOnly {
    int i;
    double d;
    boolean b;

    @Override
    public String toString() {
        return "DataOnly{" +
                "i=" + i +
                ", d=" + d +
                ", b=" + b +
                '}';
    }

    public int storage(String s){
        return s.length() * 2;
    }
}
