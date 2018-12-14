package yfc.chapter10;

public class Practice13 {

    public interface9 getNameInterface() {
        return new interface9() {
            @Override
            public void displayName() {
                System.out.println("className : Practice15");
            }
        };
    }

    public static void main(String[] args) {
        Practice13 p1 = new Practice13();
        interface9 nameInterface = p1.getNameInterface();
        nameInterface.displayName();
    }
}
