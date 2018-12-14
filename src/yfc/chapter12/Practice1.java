package yfc.chapter12;

public class Practice1 {

    public static void main(String[] args) {
        try {
            throw new Exception("throw 测试");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("执行了此处");
        }
    }
}
