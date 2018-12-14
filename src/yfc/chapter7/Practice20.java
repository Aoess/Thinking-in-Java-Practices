package yfc.chapter7;

public class Practice20 extends test20{

//    @Override
    public void display(String str){
        //super.display(str);
        System.out.println("this is a Practice20 " + str);
    }
    public static void main(String[] args) {
        Practice20 p1 = new Practice20();
        p1.display("爱徐静");
    }
}
