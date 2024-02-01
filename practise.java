class Mythread extends Thread{
    public void run(){
        System.out.println("Hello");
        
    }
}

class Mythread1 extends Thread{
    public void run(){
        System.out.println("hi ");
        System.out.println("hi ");
        
}
public class practise {

    public static void main(String[] args) {
        Mythread a = new Mythread();
        Mythread1 b = new Mythread1();
        a.start();
        b.start();
    }
}