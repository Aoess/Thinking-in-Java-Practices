package yfc.chapter7;

public class Practice13 extends test13{
    public void display(Character ch){
        System.out.println(ch.getClass().getName());
    }


    public static void main(String[] args) {
        Practice13 p1 = new Practice13();
        p1.display('v');
        p1.display(12);
        p1.display("123");
        p1.display(12.0);
    }
}
