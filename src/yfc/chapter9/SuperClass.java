package yfc.chapter9;

public class SuperClass extends BaseClass {
    private int id;

    public SuperClass(int id) {
        this.id = id;
        print();
    }

    @Override
    public void print() {
        System.out.println("id = " + id);
    }
}
