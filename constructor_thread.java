class namit implements Runnable{
    public void run(){
        System.out.println("hi i am in thread");
    }
}

public class constructor_thread {
    public static void main(String[] args) {
        namit a = new namit();

        Thread obj = new Thread(a , "My thread is ");
        obj.start();
    }
}