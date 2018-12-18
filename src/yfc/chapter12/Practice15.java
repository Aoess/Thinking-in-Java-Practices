package yfc.chapter12;

public class Practice15 {
    static Switch sw = new Switch();
    public static void main(String[] args) {
        try{
            sw.on();
            Practice14.f();
        }catch (Switch.OnOffException1 onOffException1) {
            onOffException1.printStackTrace();
        } catch (Switch.OnOffException2 onOffException2) {
            onOffException2.printStackTrace();
        }finally {
            sw.off();
        }
    }
}
