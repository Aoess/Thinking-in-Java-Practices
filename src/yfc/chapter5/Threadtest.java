package yfc.chapter5;

public class Threadtest {

    public static void main(String[] args ){
        Threadtest t1 = new Threadtest();
        threadduixiang t2 = t1.new threadduixiang();
        new Thread(t1.new threadtest(t2)).start();
        new Thread(t1.new threadtest(t2)).start();
    }

    public class threadtest implements Runnable{

        private threadduixiang t1 = null;

        public threadtest(threadduixiang t1) {
            this.t1 = t1;
        }

        @Override
        public void run() {
            String str = "燕富成";
            t1.test(str);
        }
    }
    public class threadduixiang{
        public void test(String str){
            synchronized (str){
                try {
                    Thread.sleep(3000);
                    System.out.println(str);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}

