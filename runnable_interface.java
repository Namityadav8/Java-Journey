class A implements Runnable{
    public void run(){
        System.out.println("inside thread 1.");
    }
}

class B implements Runnable{
    public void run(){
        System.out.println("Inside thread 2.");
    }
}
public class runnable_interface {
    
    public static void main(String[] args) {
        A obj = new A(); 
        B obj1 = new B();

        Thread ram = new Thread(obj);
        Thread sita = new Thread(obj1);

        ram.start();
        sita.start();
    }
}