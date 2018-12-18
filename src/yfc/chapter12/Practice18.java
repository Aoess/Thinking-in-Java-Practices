package yfc.chapter12;

public class Practice18 {

    void f() throws Exception1 {
        throw new Exception1("Exception1");
    }
    void dispose() throws Exception2 {
        throw new Exception2("Exception2");
    }
    void dispose2() throws Exception3 {
        throw new Exception3("Exception3");
    }

    public static void main(String[] args) {
        try {
            Practice18 p1 = new Practice18();
            try {
                p1.f();
            }finally {
                try {
                    p1.dispose();
                }finally {
                    p1.dispose2();
                }
            }
        }catch (Exception e) {
            System.out.println(e);
        }
    }
}
