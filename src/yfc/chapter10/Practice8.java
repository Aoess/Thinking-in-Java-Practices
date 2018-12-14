package yfc.chapter10;

public class Practice8 {

    practice8_neibu p1 = new practice8_neibu();

    private class practice8_neibu {
        private String name = getClass().getSimpleName();
    }

    public void displayNeibuclassName() {
        System.out.println(p1.name);
    }

    public static void main(String[] args) {
        Practice8 p1 = new Practice8();
        p1.displayNeibuclassName();
    }
}
