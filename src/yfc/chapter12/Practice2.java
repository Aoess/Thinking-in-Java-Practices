package yfc.chapter12;

public class Practice2 {

    public static void main(String[] args) {
        try {
            String str = null;
            str.toString();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
