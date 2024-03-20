class A extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
        System.out.println("Class A");
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                // TODO: handle exception
            }

        }
    }
}

class B extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
        System.out.println("Class B");
        try {
            Thread.sleep(50);
        } catch (Exception e) {
            // TODO: handle exception
        }
        }
    }
}

public class thread {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.start();
        b.start();
    }
}
