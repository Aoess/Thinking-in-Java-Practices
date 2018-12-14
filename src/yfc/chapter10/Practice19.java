package yfc.chapter10;

public class Practice19 {

    static class staticclass_G1 {

        static class staticclass_G2 {

        }
    }

    class class_G1 {

        class class_G2 {

        }
    }
    public static void main(String[] args) {
        System.out.println(new Practice19());
        System.out.println(new staticclass_G1());
        System.out.println(new staticclass_G1.staticclass_G2());

        System.out.println(new Practice19());
        System.out.println(new Practice19().new class_G1());
        System.out.println(new Practice19().new class_G1().new class_G2());
    }
}
