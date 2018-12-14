package yfc.chapter7;

public class Practice18 {

    public final static String str;
    public final String str1;
    static {
        str = "1";
    }

    public Practice18(){
        str1 = "2";
        System.out.println("str1 = " + str1);
    }

    public static void main(String[] arsg) {
        Practice18 pa = new Practice18();
        System.out.println(Practice18.str);
    }
}
