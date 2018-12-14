package yfc.chapter10;

import java.util.Random;

public class Practice17 {

    public static void main(String[] args) {
        for(int i = 0; i < 5; i++) {
            System.out.println(coin.getCoin().getPer());
        }

    }
}
class coin {
    protected int per;
    public int getPer() {
        return per;
    }

    public void setPer(int per) {
        this.per = per;
    }

    public static coin getCoin() {
        Random rand = new Random();
        return new coin() {
            {
                per = rand.nextInt(2);
            }
        };
    }
}
