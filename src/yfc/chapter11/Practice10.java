package yfc.chapter11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Practice10 {

    public static void main(String[] args) {
        List<Rodent> list = new ArrayList<>();
        list.add(new Mouse());
        list.add(new Gerbil1());
        list.add(new Hamster());

        Iterator<Rodent> iterator = list.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}

abstract class Rodent {
    abstract public void eat();
}

class Mouse extends Rodent {

    @Override
    public void eat() {
        System.out.println("吱 吱 吱 !!");
    }
}

class Gerbil1 extends Rodent {

    @Override
    public void eat() {
        System.out.println("渣 渣 渣 !!");
    }
}

class Hamster extends Rodent {

    @Override
    public void eat() {
        System.out.println("咔 咔 咔 !!");
    }
}