package yfc.chapter13;

import java.util.Arrays;

public class Practice8 {

    public static void main(String[] args) {
        String setens = "Then, when you have found the shrubbery, you must cut down the mightiest tree in the forcest... with... a herring!";
        String[] list = setens.split("the|you");
        System.out.println(Arrays.toString(list));
    }
}
