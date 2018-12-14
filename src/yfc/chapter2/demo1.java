package yfc.chapter2;

public class demo1 {
    private int age;
    private char sex;

    public demo1() {
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public char getSex() {
        return sex;
    }

    @Override
    public String toString() {
        return "demo1{" +
                "age=" + age +
                ", sex=" + sex +
                '}';
    }
}
