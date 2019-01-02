package yfc.chapter13;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//{Args: D:\test.txt "^(\\")+.*\\"$"}
/*
    D:/test.txt
    Scan
    "Tddd"
    Resa
    "Rose"
    Kill"
    "Love
    Like
    student
    school
 */

public class Practice18 {

    public static void main(String[] args) throws FileNotFoundException {
        if(args.length < 2) {
            System.out.println("Usage: java JGrep file regex");
            System.exit(0);
        }
        Pattern p = Pattern.compile(args[1]);
        int index = 0;
        String str;
        Matcher m = p.matcher("");
        Scanner scan = new Scanner(new BufferedInputStream(new FileInputStream(new File(args[0]))));
        while(scan.hasNext()) {
            str = scan.nextLine();
            m.reset(str);
            while(m.find()) {
                System.out.println(index++ + " " + m.group() + " " + m.start() + " " + m.end());
            }
        }
    }
}
