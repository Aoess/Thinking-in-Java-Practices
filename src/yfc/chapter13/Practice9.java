package yfc.chapter13;

import java.util.Arrays;

public class Practice9 {

    public static void main(String[] args) {
        String setens = "Then, when you have found the shrubbery, you must cut down the mightiest tree in the forcest... with... a herring!";
        setens = setens.replaceAll("a|e|i|o|u","_");
        System.out.println(setens);
    }
}
