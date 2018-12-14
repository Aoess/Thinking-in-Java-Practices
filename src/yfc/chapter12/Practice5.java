package yfc.chapter12;

public class Practice5 {

    public static void main(String[] args) {
        int count = 0;
        boolean flag = true;
        while(flag) {
            try {
                if(++count < 3){
                    throw new Exception("徐静大坏蛋");
                }
                flag = false;
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println("循环跳出");
    }
}
