package yfc.chapter2;

public class Practice4 {

    public static void main(String[] args){
        DataOnly data = new DataOnly();
        data.i = 47;
        data.b = false;
        data.d = 1.1;

        System.out.println(data);
        System.out.println(data.storage("燕富成爱徐静"));
    }
}
