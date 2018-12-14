package yfc.chapter10;

public class Practice16 {
    public static Cycle unicycleFactory() {
        return new Cycle() {
            @Override
            public void ride() {
                System.out.println("Unicycle ride");
            }
        };
    }

    public static Cycle bicycleFactory() {
        return new Cycle() {
            @Override
            public void ride() {
                System.out.println("Bicycle ride");
            }
        };
    }

    public static Cycle tricycleFactory() {
        return new Cycle() {
            @Override
            public void ride() {
                System.out.println("Tricycle ride");
            }
        };
    }

    public static void main(String[] args) {
        unicycleFactory().ride();
        bicycleFactory().ride();
        tricycleFactory().ride();
    }
}

interface Cycle {
    public void ride();
}
