package yfc.chapter13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Practice11 {

    public static void main(String[] args) {
        String rex = "(?i)((^[aeiou])|(\\s+[aeiou]))\\w+?[aeiou]\\b";
        String text = "Arline ate eight apples and one orange while Anita hadn' t any";
        Pattern pa = Pattern.compile(rex);
        Matcher matcher = pa.matcher(text);

        while(matcher.find()) {
            System.out.println(matcher.group());
        }

    }
}
