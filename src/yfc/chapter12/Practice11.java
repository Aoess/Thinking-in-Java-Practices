package yfc.chapter12;

public class Practice11 {

    public static void main(String[] args) {
        test11 t1 = new test11();
        t1.f();
    }
}

class test11 {
    public void f(){
        try {
            g();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void g() throws Exception {
        throw new Exception("g");
    }
}
