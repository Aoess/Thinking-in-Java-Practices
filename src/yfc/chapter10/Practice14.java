package yfc.chapter10;

public class Practice14 {

    static void vampireAction(Vampire v) {
        v.destroy();
        v.drinkBlood();
        v.kill();
        v.menace();
    }

    public static void main(String[] args) {
        vampireAction(new Vampire() {
            @Override
            public void menace() {
                System.out.println("this is a menace");
            }

            @Override
            public void destroy() {
                System.out.println("this is a destroy");
            }

            @Override
            public void kill() {
                System.out.println("this is a kill");
            }

            @Override
            public void drinkBlood() {
                System.out.println("this is a drinkblood");
            }
        });
    }
}

interface Vampire {
    public void menace();
    public void destroy();
    public void kill();
    public void drinkBlood();
}