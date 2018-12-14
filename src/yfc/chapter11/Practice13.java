package yfc.chapter11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Practice13 {

    public static void main(String[] args) {
        System.out.println(System.nanoTime());
        GreenhouseControls gs = new GreenhouseControls();
        Event[] list = new Event[2];
        list[0] = gs.new ktON(100);
        list[1] = gs.new ktOFF(500);
        gs.addlist(list);
        gs.run();
    }
}

abstract class Event {
    private long eventTime;
    protected final long delayTime;
    public Event(long delayTime) {
        this.delayTime = delayTime;
        start();
    }

    public void start() {
        eventTime = System.nanoTime() + delayTime;
    }

    public boolean ready() {
        return System.nanoTime() >= eventTime;
    }
    public abstract void action();

}

class Controller {
    private List<Event> eventList = new LinkedList<Event>();
    public void addEvent(Event c) {
        eventList.add(c);
    }

    public void run() {
        while(eventList.size() > 0) {
            Iterator<Event> iterator = eventList.iterator();
            while(iterator.hasNext()) {
                Event next = iterator.next();
                if(next.ready()) {
                    System.out.println(next);
                    next.action();
                    eventList.remove(next);
                }
            }
        }
    }
}

class GreenhouseControls extends Controller {

    boolean kt = false;
    public class ktON extends Event {

        public ktON(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            kt = true;
        }

        @Override
        public String toString() {
            return "ktON{}";
        }
    }

    public class ktOFF extends Event {

        public ktOFF(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            kt = false;
        }

        @Override
        public String toString() {
            return "ktOFF{}";
        }
    }

    public void addlist(Event[] list) {
        for (int i = 0; i < list.length; i++) {
            addEvent(list[i]);
        }
    }
}
