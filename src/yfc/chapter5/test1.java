package yfc.chapter5;

public class test1 {

    private String name;

    public test1() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "test1{" +
                "name='" + name + '\'' +
                '}';
    }
}
