// import java.lang.Thread;
// import java.util.Concurrent;
class MyThread1 extends Thread {
    @Override
    public void run() {
        // Code for the first thread
        
        while (true) {
            System.out.println("hello");
            
        }
    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
        // Code for the second thread
     
        while (true) {
            System.out.println("hi");
           
        }
    }
}

public class threading {
    public static void main(String[] args) {
        MyThread1 thread1 = new MyThread1();
        MyThread2 thread2 = new MyThread2();
        
        thread1.start(); // Start the first thread
        thread2.start(); // Start the second thread
    }
}
