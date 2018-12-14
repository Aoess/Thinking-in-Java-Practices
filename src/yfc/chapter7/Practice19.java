package yfc.chapter7;

public class Practice19 {

    private final String str;

    public Practice19(){
        str = "1";
    }

    @Override
    public String toString() {

        return "Practice19{" +
                "str='" + str + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Practice19 p1 = new Practice19();
        System.out.println(p1.toString());
    }
}
