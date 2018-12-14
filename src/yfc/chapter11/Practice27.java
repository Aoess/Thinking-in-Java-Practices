package yfc.chapter11;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class Practice27 {

    public static void addCommand(Queue<Command> queue, int size) {
        for(int i = 0; i < size; i++) {
            queue.offer(new Command(Generator_String.next()));
        }
    }

    public static void pollCommand(Queue<Command> queue) {
        for(int i = 0; i < queue.size(); i++) {
            System.out.println(queue.poll().operation());
        }
    }

    public static void main(String[] args) {
        Queue<Command> queue = new LinkedBlockingDeque<>();
        addCommand(queue,20);
        pollCommand(queue);
    }
}

class Command {
    private String name;

    public Command(String name) {
        this.name = name;
    }

    public String operation(){
        return name;
    }

    @Override
    public String toString() {
        return "Command{" +
                "name='" + name + '\'' +
                '}';
    }
}
