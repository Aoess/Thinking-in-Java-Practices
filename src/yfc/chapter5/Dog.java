package yfc.chapter5;

public class Dog {

    private String name;

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void bark(int barking) {
        System.out.println("barking");
    }
    public void bark(double howling) {
        System.out.println("howling");
    }

    public void run(int foot, double hand) {
        System.out.println("int->double-run");
    }
    public void run(double foot, int hand) {
        System.out.println("double->int-run");
    }
}
