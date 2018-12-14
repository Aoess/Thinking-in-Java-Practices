package yfc.chapter10;

public class Practice10 {

    public interface9 getNameInterface(boolean flag) {
        if(flag) {
            class Practice9_neibu implements interface9 {

                @Override
                public void displayName() {
                    System.out.println("className : Practice10");
                }
            }
            return new Practice9_neibu();
        }
        return null;
    }

    public static void main(String[] args) {
        Practice10 p1 = new Practice10();
        interface9 nameInterface1 = p1.getNameInterface(true);
        nameInterface1.displayName();
        interface9 nameInterface2 = p1.getNameInterface(false);
        nameInterface2.displayName();//空指针
    }
}
