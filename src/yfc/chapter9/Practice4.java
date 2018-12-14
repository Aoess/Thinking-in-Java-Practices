package yfc.chapter9;

public class Practice4 {
    public static void display(test2 t2){
        ((test4) t2).display();
    }
    public static void display2(test2 t2){
        t2.display();
    }
    public static void main(String[] args) {
        test4 t1 = new test4();
//        display(t1);
        display2(t1);
    }
}
