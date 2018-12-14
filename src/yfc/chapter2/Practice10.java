package yfc.chapter2;

public class Practice10 {

    public static void main(String[] args) {
        String[] list = "燕,富,成,爱,徐,静".split(",");
        display(list);
    }

    private static void display(String[] args) {
        for(int i = 0; i < args.length; i++){
            System.out.println(args[i]);
        }
    }
}
