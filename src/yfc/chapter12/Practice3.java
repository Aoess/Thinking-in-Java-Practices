package yfc.chapter12;

public class Practice3 {

    public static void main(String[] args) {
        String[] list = new String[3];
        for(int i = 0; i < 3; i++) {
            list[i] = "abc";
        }
        try {
            System.out.println(list[3]);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
