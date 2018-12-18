package yfc.chapter12;

public class Practice19 {

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
            Practice19 p1 = new Practice19();
            try {
                p1.f();
            }catch (Exception e) {
                System.out.println(e);
            } finally{
                try {
                    p1.dispose();
                }catch (Exception e) {
                    System.out.println(e);
                }finally {
                    p1.dispose2();
                }
            }
        }catch (Exception e) {
            System.out.println(e);
        }
    }
}
