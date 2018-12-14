package yfc.chapter12;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class Practice10 {

    public static void main(String[] args) {
        test10 t1 = new test10();
        try {
            t1.f();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class test10 {
    public void f() throws Exception {
        try {
            g();
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    public void g() throws Exception {
        throw new Exception("g");
    }
}
