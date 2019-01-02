package yfc.chapter13;

import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//{Args: D:/test "^s+(.)*" CASE_INSERSITIVE}
/*
    D:/test
    test.txt
    test2.txt
    test3.txt
 */

public class Practice16 {

    static Pattern p;
    static int index = 0;
    public static void getFile(File file) throws FileNotFoundException {
        if(file.isDirectory()) {
            File[] filelist = file.listFiles();
            for (File file1 : filelist) {
                getFile(file1);
            }
        }else {
            display(file);
        }
    }

    public static void display(File file) throws FileNotFoundException {
        Matcher m = p.matcher("");
        String str;
        Scanner scan = new Scanner(new BufferedInputStream(new FileInputStream(file)));
        while(scan.hasNext()) {
            str = scan.nextLine();
            m.reset(str);
            while(m.find()) {
                System.out.println(index++ + " " + m.group() + " " + m.start() + " " + m.end());
            }
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        if(args.length < 2) {
            System.out.println("Usage: java JGrep file regex");
            System.exit(0);
        }

        if(args.length > 2) {
            switch(args[2]) {
                case "CASE_INSENSITIVE" : {
                    p = Pattern.compile(args[1],Pattern.CASE_INSENSITIVE);
                    break;
                }
                default: {
                    p = Pattern.compile(args[1]);
                    break;
                }
            }
        }else {
            p = Pattern.compile(args[1]);
        }
        getFile(new File(args[0]));
    }
}
