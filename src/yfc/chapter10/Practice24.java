package yfc.chapter10;

import java.util.ArrayList;
import java.util.List;

public class Practice24 {

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
    private List<Event> eventList = new ArrayList<Event>();
    public void addEvent(Event c) {
        eventList.add(c);
    }

    public void run() {
        while(eventList.size() > 0) {
            for (int i = 0; i < eventList.size(); i++) {
                if(eventList.get(i).ready()) {
                    System.out.println(eventList.get(i));
                    eventList.get(i).action();
                    eventList.remove(eventList.get(i));
                }
            }
        }
    }
}
class GreenhouseControls extends Controller {

    boolean kt = false;
    public class ktON extends Event{

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

    public class ktOFF extends Event{

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
