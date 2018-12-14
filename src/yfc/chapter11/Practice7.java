package yfc.chapter11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice7 {
    public static void main(String[] args) {
        KOF[] list = {new KOF("KOY"),new KOF("IORI"),new KOF("OROCHI")};
        List<KOF> kofs = new ArrayList<>(Arrays.asList(list));
        System.out.println(kofs);
        List<KOF> kofs1 = kofs.subList(0, 2);
        System.out.println(kofs1);
        kofs.removeAll(kofs1);
        System.out.println(kofs);
    }
}

class KOF {
    String name;

    public KOF(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "KOF{" +
                "name='" + name + '\'' +
                '}';
    }
}
