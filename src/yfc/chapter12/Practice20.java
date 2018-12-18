package yfc.chapter12;

public class Practice20 {

    public static void main(String[] args) {
        ExceptionTest e1 = new ExceptionTest();
        ExceptionTest2 e2 = new ExceptionTest2();
        try {
            e1.getExceptions();
            e2.getExceptions();
        } catch (Exception2 exception2) {
            exception2.printStackTrace();
        } catch (Exception1 exception1) {
            exception1.printStackTrace();
        }

        try {
            e2.getExceptions();
        } catch (Exception2 exception2) {
            exception2.printStackTrace();
        } catch (Exception11 exception11) {
            exception11.printStackTrace();
        }
    }
}

class Exception11 extends Exception1 {

    public Exception11(String message) {
        super(message);
    }
}

class ExceptionTest {

    public void getException1() throws Exception1{};

    public void getException11() throws Exception11{};

    public void getException2() throws Exception2{};

    public void getExceptions() throws Exception2,Exception11,Exception1{};
}

class ExceptionTest2 extends ExceptionTest {
    @Override
    public void getException1(){
    }

    @Override
    public void getExceptions() throws Exception2, Exception11{
    }
}