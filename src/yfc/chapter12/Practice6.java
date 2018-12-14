package yfc.chapter12;

import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class Practice6 {

    public static void main(String[] args) {
        try {
            throw new MyExecption1("logging测试");
        }catch (Exception e) {
            e.printStackTrace();
        }

    }
}
class MyExecption1 extends Exception {

    Logger logger = Logger.getLogger("MyException");

    public MyExecption1(String message) {
        super(message);
    }

    @Override
    public void printStackTrace() {
        StringWriter sw = new StringWriter();
        super.printStackTrace(new PrintWriter(sw));
        logger.severe(sw.toString());
    }

    public void displayLog() {

    }
}
