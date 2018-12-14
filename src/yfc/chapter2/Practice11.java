package yfc.chapter2;

public class Practice11 {

    class AllTheColorsOfTheRainBow {
        int anIntegerRepresentingColors;
        void changTheHueOfTheColor(int newHue){
            System.out.println(newHue);
        }
    }

    public static void main(String[] args) {
        Practice11 p1 = new Practice11();
        Practice11.AllTheColorsOfTheRainBow pa = p1.new AllTheColorsOfTheRainBow();
        System.out.println(pa.anIntegerRepresentingColors);
        pa.changTheHueOfTheColor(2);
    }
}
