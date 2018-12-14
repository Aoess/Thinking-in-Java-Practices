package yfc.chapter10;

public class test12 {

    private String name;

    private void setNameToYFC() {
        name = "YFC";
    }

    public test12(String name) {
        this.name = name;
    }

    public void setName() {
        System.out.println(name);
        neibu t1 = new neibu() {
            @Override
            public void setNameToXJ() {
                name = "XJ";
            }

            @Override
            public void setNameToBaba() {
                name = "YFC";
            }
        };
        t1.setNameToXJ();
        System.out.println(name);
        t1.setNameToBaba();
        System.out.println(name);
    }
}
interface neibu {
    void setNameToXJ();

    void setNameToBaba();
}
