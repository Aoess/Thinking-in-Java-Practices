package yfc.chapter12;

public class Practice30 {
    public static void main(String[] rags) {
        for(int i = 0; i < 4; i++) {
            try{
                if(i < 3){
                    WrapCheckedException.getException(i);
                }else{
                    throw new Exception1("I am Exception1");
                }
            }catch (Exception1 e) {
                System.out.println(e);
            }catch (RuntimeException re) {
                try {
                    throw re.getCause();
                } catch (Annoyance ae) {
                    System.out.println(ae);
                }catch (Sneeze1 ae) {
                    System.out.println(ae);
                }catch (Throwable ae) {
                    System.out.println(ae);
                }
            }
        }
    }
}

class Annoyance extends RuntimeException {
}
class Sneeze1 extends RuntimeException {
}

class WrapCheckedException {
    static void getException(int i) {
        try{
            switch (i) {
                case 0: {
                    throw new Sneeze1();
                }
                case 1: {
                    throw new Annoyance();
                }
                case 2: {
                    throw new RuntimeException("where am I");
                }
            }
        }catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}

