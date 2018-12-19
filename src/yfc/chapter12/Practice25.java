package yfc.chapter12;

public class Practice25 {
    public static void main(String[] args) {
        Et1 e1 = new Et3();
        try {
            e1.display();
        } catch (Eg1 eg1) {
            eg1.printStackTrace();
        }
    }
}

class Eg1 extends Exception{}
class Eg2 extends Eg1{}
class Eg3 extends Eg2{}

class Et1 {
    public void display() throws Eg1 {
        throw new Eg1();
    }
}
class Et2 extends Et1{
    @Override
    public void display() throws Eg2 {
        throw new Eg2();
    }
}
class Et3 extends Et2{
    @Override
    public void display() throws Eg3 {
        throw new Eg3();
    }
}
