package yfc.chapter10;

public class Practice23 {

    public static void main(String[] args) {
        A[] lista = new A[]{new A(),new A(),new A(),new A(),new A()};
        B b = new B();
        for(int i = 0 ;i < 5; i++) {
            b.add(lista[i].getU());
        }
        b.actU();

    }
}

interface U {
    void method1();
    void method2();
    void method3();
}

class A {

    public U getU() {
        return new U() {
            @Override
            public void method1() {
                System.out.println("this is " + this.toString() + " is method1");
            }

            @Override
            public void method2() {
                System.out.println("this is " + this.toString() + " is method2");
            }

            @Override
            public void method3() {
                System.out.println("this is " + this.toString() + " is method3");
            }
        };
    }
}

class B {
    U[] list_u = new U[5];
    int i = 0;
    public void add(U u) {
        if(i < 5){
            list_u[i++] = u;
        }
    }

    public void clear() {
        for(int ii = 0; ii < list_u.length; ii++) {
            list_u[ii] = null;
        }
        i = 0;
    }

    public void actU() {
        for(int ii = 0; ii < i; ii++) {
            list_u[ii].method1();
            list_u[ii].method2();
            list_u[ii].method3();
        }
    }

}
