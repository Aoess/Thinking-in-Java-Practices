package yfc.chapter13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Practice13 {


    public static void main(String[] args) {
        String rex = "^[A-Z]+(.){4}";
        String text = "Erline ate Eight apples and One orange While Anita hadn' t any";
        Pattern pa = Pattern.compile(rex);
        Matcher matcher = pa.matcher(text);

        while(matcher.find()) {
            for(int i= 0; i < matcher.groupCount(); i++) {
                System.out.println(matcher.group(i));
            }
        }

        if(matcher.lookingAt()) {
            System.out.println(matcher.group());
        }
        //没做出来.,..
        if(matcher.matches()) {
            System.out.println(matcher.group());
        }

    }
}
