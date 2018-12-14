package yfc.chapter12;

public class Practice8 {

    public static void main(String[] args) {
        NullPointException n1 = new NullPointException();
        try {
            n1.throwNullPoint();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class NullPointException {

    public void throwNullPoint() throws Exception {
        throw new Exception();
    }
}
