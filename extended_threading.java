class MyThread1 extends Thread {
    @Override
    public void run() {
        // Code for the first thread
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            try {
                // Introduce a delay of 100 milliseconds
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
        for (int i = 5; i < 10; i++) {
            System.out.println(i);
            try {
                // Introduce a delay of 100 milliseconds
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class extended_threading {
    public static void main(String[] args) {
        MyThread1 thread1 = new MyThread1();
        MyThread2 thread2 = new MyThread2();
        
        thread1.start(); 
        thread2.start();
    }
}
