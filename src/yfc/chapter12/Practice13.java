package yfc.chapter12;

public class Practice13 {

    public static void main(String[] args) {
        try {
//            throw new Exception1("Exception4");
//            throw new Exception2("Exception5");
//            throw new Exception3("Exception6");
            throw new NullPointerException();
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            System.out.println("finally执行了");
        }
    }
}

class Exception4 extends Exception {

    public Exception4(String message) {
        super(message);
    }
}
class Exception5 extends Exception {

    public Exception5(String message) {
        super(message);
    }
}
class Exception6 extends Exception {

    public Exception6(String message) {
        super(message);
    }
}
