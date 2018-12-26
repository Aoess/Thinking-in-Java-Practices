package yfc.chapter13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Practice12 {

    //没做出来.,..
    public static void main(String[] args) {
        String rex = "^[A-Z](\\S)$";
        String text = "Erline ate Eight apples and One orange While Anita hadn' t any";
        Pattern pa = Pattern.compile(rex);
        Matcher matcher = pa.matcher(text);

        while(matcher.find()) {
            System.out.println(matcher.group(0));
        }

    }
}
