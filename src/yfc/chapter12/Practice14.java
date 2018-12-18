package yfc.chapter12;

public class Practice14 {
    private static Switch sw = new Switch();
    public static void f() throws Switch.OnOffException1,Switch.OnOffException2{
        throw new RuntimeException();
    }
    public static void main(String[] args) {
        try{
            sw.on();
            f();
            sw.off();
        } catch (Switch.OnOffException1 onOffException1) {
            System.out.println(onOffException1);
            sw.off();
        } catch (Switch.OnOffException2 onOffException2) {
            System.out.println(onOffException2);
            sw.off();
        }
    }
}

class Switch {

    private boolean state = false;
    public boolean read() {
        return state;
    }
    public void on() {
        state = true;
        System.out.println(this);
    }
    public void off() {
        state =false;
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Switch{" +
                "state=" + state +
                '}';
    }

    public static class OnOffException1 extends Exception { }
    public static class OnOffException2 extends Exception { }

}


