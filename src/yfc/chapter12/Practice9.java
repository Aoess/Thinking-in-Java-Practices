package yfc.chapter12;

public class Practice9 {

    public static void main(String[] args) {
        try {
//            throw new Exception1("Exception1");
//            throw new Exception2("Exception2");
            throw new Exception3("Exception3");
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Exception1 extends Exception {

    public Exception1(String message) {
        super(message);
    }
}
class Exception2 extends Exception {

    public Exception2(String message) {
        super(message);
    }
}
class Exception3 extends Exception {

    public Exception3(String message) {
        super(message);
    }
}
