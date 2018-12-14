package yfc.chapter12;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class Practice7 {

    public static void main(String[] args) {
        String[] list = new String[3];
        Logger logger = Logger.getLogger("Exception");
        for(int i = 0; i < 3; i++) {
            list[i] = "abc";
        }
        try {
            System.out.println(list[3]);
        }catch (Exception e) {
            StringWriter sw = new StringWriter();
            e.printStackTrace(new PrintWriter(sw));
            logger.severe(sw.toString());
            System.out.println(logger.getName());
        }
    }
}
