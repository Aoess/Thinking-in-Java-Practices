package yfc.chapter12;

public class Practice4 {

    public static void main(String[] args) {
        try {
            throw new MyException("徐静最美了");
        }catch (MyException e) {
            e.displayMessage();
            e.printStackTrace();
        }
    }
}

class MyException extends Exception {

    private String message;

    public MyException(String message) {
        super(message);
        this.message = message;
    }

    public void displayMessage() {
        System.out.println(message);
    }
}
