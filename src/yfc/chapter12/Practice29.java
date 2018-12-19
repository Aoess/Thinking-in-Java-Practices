package yfc.chapter12;

public class Practice29 {

    public static void main(String[] args) {
        ExceptionTest29 e1 = new ExceptionTest29();
        ExceptionTest29_2 e2 = new ExceptionTest29_2();

        try {
            e1.getExceptions();
        } catch (Exception1 exception1) {
            exception1.printStackTrace();
        }

        e1.getException29_2();
    }
}

class Exception29 extends RuntimeException {

    public Exception29(String message) {
        super(message);
    }
}

class Exception29_2 extends Exception29 {

    public Exception29_2(String message) {
        super(message);
    }
}

class ExceptionTest29 {

    public void getException1() throws Exception1{}

    public void getException29() throws Exception29{}

    public void getException29_2() throws Exception29_2{}

    public void getExceptions() throws Exception29,Exception29_2,Exception1{}
}

class ExceptionTest29_2 extends ExceptionTest {
    @Override
    public void getException1(){
    }

    @Override
    public void getExceptions() throws Exception2, Exception11{
    }
}