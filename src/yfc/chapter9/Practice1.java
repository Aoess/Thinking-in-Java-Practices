package yfc.chapter9;

public class Practice1 extends Rodent{
    private String name;

    public Practice1(String name) {
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("Practice1 eat name = " + name);
    }

    public static void main(String[] args) {
        Practice1 t1 = new Practice1("燕富成");
        t1.eat();
    }
}
