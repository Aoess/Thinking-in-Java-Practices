package yfc.chapter10;

public class Practice15 {
    public static class_1 getClass_1(int i) {
        return new class_1(i){
            @Override
            public String toString() {
                return "$classname{" +
                        "id=" + id +
                        '}';
            }
        };
    }

    public static void main(String[] args) {
        System.out.println(getClass_1(10));
    }
}

class class_1 {
    int id;
    public class_1(int n) {
        id = n;
    }

    @Override
    public String toString() {
        return "class_1{" +
                "id=" + id +
                '}';
    }
}

