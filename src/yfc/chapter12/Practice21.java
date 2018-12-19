package yfc.chapter12;

public class Practice21 extends test21{

    public Practice21() throws Exception1 {
        super();
    }

    public static void main(String[] args) throws Exception1 {
        Practice21 p21 = new Practice21();
    }
}

class test21 {

    public test21() throws Exception1 {
        throw new Exception1("异常1");
    }
}
