package yfc.chapter12;

import java.util.Random;

public class Practice22 {

    public static void main(String[] args) {
        FailingConstructor f1 = null;
        try {
            f1 = new FailingConstructor("燕富成");
            System.out.println(f1.toString());
        } catch (Exception1 exception1) {
            exception1.printStackTrace();
        }
    }
}

class FailingConstructor {
    private String name;

    public FailingConstructor(String name) throws Exception1 {
        Random random = new Random();
        if(random.nextBoolean()) {
            this.name = name;
        }else{
            throw new Exception1("构造失败");
        }
    }

    @Override
    public String toString() {
        return "FailingConstructor{" +
                "name='" + name + '\'' +
                '}';
    }
}
