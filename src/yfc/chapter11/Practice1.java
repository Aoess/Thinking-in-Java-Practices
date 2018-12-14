package yfc.chapter11;

import java.util.ArrayList;
import java.util.List;

public class Practice1 {

    public static void main(String[] args) {
        List<Gerbil> list = new ArrayList<Gerbil>();
        for(int i = 0; i < 10; i++) {
            list.add(new Gerbil());
        }
        for(int i = 0; i < 10; i++) {
            list.get(i).hop();
        }
    }

}

class Gerbil {
    private static int number = 0;
    private int gerbilNumber = ++number;

    public void hop() {
        System.out.println("I am hopping " + gerbilNumber);
    }

    @Override
    public String toString() {
        return "Gerbil{" +
                "gerbilNumber=" + gerbilNumber +
                '}';
    }
}
