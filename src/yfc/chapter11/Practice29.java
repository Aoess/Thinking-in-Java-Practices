package yfc.chapter11;

import java.util.PriorityQueue;
import java.util.Queue;

public class Practice29 {

    public static void main(String[] args) {
        Queue<test29> queue = new PriorityQueue<>();
        queue.offer(new test29());
        queue.offer(new test29());
        queue.offer(new test29());
        System.out.println(queue);
    }
}

class test29 {

}
