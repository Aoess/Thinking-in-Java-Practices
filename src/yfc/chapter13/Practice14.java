package yfc.chapter13;

import java.util.Arrays;

public class Practice14 {

    public static void main(String[] args) {
        String input = "This!!unusual user!!of exclamation!!points";
        String[] list = input.split("!!");
        System.out.println(Arrays.toString(list));
    }
}
