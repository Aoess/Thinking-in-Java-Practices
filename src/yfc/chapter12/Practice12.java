package yfc.chapter12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Practice12 {

    public static void main(String[] args) {
        Sequence s1 = new Sequence();
        try {
            s1.add("1");
            s1.add("2");
            s1.add("3");
            s1.add("4");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
class Sequence {

    private String[] arr = new String[3];
    private int size = 0;

    public void add(String str) throws Exception {
        if(size == 3) {
            throw new Exception("数组满了");
        }
        System.out.println("添加成功" + str);
        arr[size++] = str;
    }

    public void display() {
        System.out.println(Arrays.toString(arr));
    }


}