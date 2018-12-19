package yfc.chapter12;

public class Practice28 {

    public static void main(String[] args) {
        throw new MyException28("徐静最美了");
    }
}

class MyException28 extends RuntimeException {

    private String message;

    public MyException28(String message) {
        super(message);
        this.message = message;
    }

    public void displayMessage() {
        System.out.println(message);
    }
}
