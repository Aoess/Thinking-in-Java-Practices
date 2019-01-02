package yfc.chapter13;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Scanner;

public class Practice20 {
    public static void main(String[] args) {
        Variable v1 = new Variable("1",5);
        System.out.println(v1.toString());
        Variable v2 = new Variable("10",4);
        System.out.println(v2.toString());
        Variable v3 = new Variable("10.1",3);
        System.out.println(v3.toString());
        Variable v4 = new Variable("100.23",2);
        System.out.println(v4.toString());
        Variable v5 = new Variable("aini",1);
        System.out.println(v5.toString());
    }
}
class Variable {

    private int vInt;
    private long vLong;
    private float vFloat;
    private double vDouble;
    private String vString;

    public Variable(String str, int number) {
        Scanner  scan = new Scanner(new Readable() {
            int count = 0;
            @Override
            public int read(CharBuffer cb) throws IOException {
                if(count == number) {
                    return -1;
                }
                else{
                    count++;
                    cb.append(str);
                    cb.append("\n");
                }
                return 10;
            }
        });
        switch (number) {
            case 5: {
                vInt = scan.nextInt();
            }case 4: {
                vLong = scan.nextLong();
            }case 3: {
                vFloat = scan.nextFloat();
            }case 2: {
                vDouble = scan.nextDouble();
            }case 1: {
                vString = scan.next();
            }
        }
    }

    @Override
    public String toString() {
        return "Variable{" +
                "vInt=" + vInt +
                ", vLong=" + vLong +
                ", vFloat=" + vFloat +
                ", vDouble=" + vDouble +
                ", vString='" + vString + '\'' +
                '}';
    }
}
