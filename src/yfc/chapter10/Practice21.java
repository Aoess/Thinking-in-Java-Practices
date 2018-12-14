package yfc.chapter10;

public class Practice21 implements interface_neibu{


    @Override
    public void dislplay() {
        System.out.println("i love xujing");
    }

    public static void main(String[] rags) {
        Practice21 p1 = new Practice21();
        interfaceStaticClass u1 = new interfaceStaticClass();

        interfaceStaticClass.display(p1);
    }
}
