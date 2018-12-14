package yfc.chapter5;

public class test9 {

    private String name;


    public test9() {
        this("燕富成");
    }

    public test9(String str) {
        this.name = str;
    }

    @Override
    public String toString() {
        return "test9{" +
                "name='" + name + '\'' +
                '}';
    }
}
