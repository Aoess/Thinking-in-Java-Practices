package yfc.chapter10;

public class test7 {

    private String name;

    private void setNameToYFC() {
        name = "YFC";
    }

    public test7(String name) {
        this.name = name;
    }

    private class test7_neibu {
        private void setNameToXJ() {
            name = "XJ";
        }

        private void setNameToBaba() {
            setNameToYFC();
        }
    }

    public void setName() {
        System.out.println(name);
        test7_neibu t1 = new test7_neibu();
        t1.setNameToXJ();
        System.out.println(name);
        t1.setNameToBaba();
        System.out.println(name);
    }
}
