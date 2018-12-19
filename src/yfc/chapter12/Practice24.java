package yfc.chapter12;

import java.util.Random;

public class Practice24 {

    public static void main(String[] args) {
        FailingConstructor3 f1 = null;
        try{
            f1 = new FailingConstructor3();
            System.out.println(f1.toString());
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class FailingConstructor3{
    private FailingConstructor f1;
    private String name;
    public FailingConstructor3() throws Exception1,Exception2 {
        name = "燕富成2";
        Random random = new Random();
        try {
            if(random.nextBoolean()) {
                throw new Exception2("构造失败");
            }
            try {
                f1 = new FailingConstructor("燕富成1");
            }catch (Exception1 e) {
                name = "构造失败";
                dispose();
                throw e;
            }
        }catch (Exception2 e) {
            name = "构造失败";
            throw e;
        }
    }

    public void dispose() {
        f1 = null;
    }
    @Override
    public String toString() {
        return "FailingConstructor2{" +
                "f1=" + f1 +
                ", name='" + name + '\'' +
                '}';
    }
}
