package yfc.chapter12;

import java.util.Random;

public class Practice23 {

    public static void main(String[] args) {
        FailingConstructor2 f1 = null;
        f1 = new FailingConstructor2();
        System.out.println(f1.toString());
    }
}

class FailingConstructor2 {
    private FailingConstructor f1;
    private String name;
    public FailingConstructor2() {
        try{
            name = "燕富成2";
            Random random = new Random();
            if(random.nextBoolean()) {
                throw new Exception2("构造失败");
            }
            f1 = new FailingConstructor("燕富成1");
        }catch (Exception2 e) {
            name = null;
        }catch (Exception1 e) {
            name = null;
            f1 = null;
        }
    }

    @Override
    public String toString() {
        return "FailingConstructor2{" +
                "f1=" + f1 +
                ", name='" + name + '\'' +
                '}';
    }
}
