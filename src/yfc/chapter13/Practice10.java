package yfc.chapter13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Practice10 {

    public static void main(String[] args) {
        String str = "Java now has regular expressions";
        Pattern[] o = new Pattern[9];
        o[0] = Pattern.compile("^Java");
        o[1] = Pattern.compile("\\Breg.*");
        o[2] = Pattern.compile("n.w\\s+h(a|j)s");
        o[3] = Pattern.compile("s?");
        o[4] = Pattern.compile("s*");
        o[5] = Pattern.compile("s+");
        o[6] = Pattern.compile("s{4}");
        o[7] = Pattern.compile("s{1}.");
        o[8] = Pattern.compile("s{0,3}");

        Matcher[] list = new Matcher[9];
        for(int i = 0; i < 9; i++) {
            list[i] = o[i].matcher(str);
        }

        for(int i = 0 ;i < 9; i++) {
            if(list[i].find()){
                System.out.println("i = " + i + " start "+list[i].start() + "end " + list[i].end());
            }
        }
    }
}
