package yfc.chapter11;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;

public class Practice28 {

    public static void main(String[] asrg) {
        Queue<Double> queue = new PriorityQueue<>();
        Random rand = new Random(47);
        for(int i = 0; i < 10; i++) {
            queue.offer(rand.nextDouble());
        }
        for(int i = 0; i < queue.size(); i++) {
            System.out.println(queue.poll());
        }
    }
}
