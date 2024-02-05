class namit extends Thread{
    public void run(){
        System.out.println("Hello");
    }

    public namit(String name){
        super(name);
    }
}
public class practise1 {
    public static void main(String[] args) {
        namit yadav = new namit("kesar");
        Thread t = new Thread();
      t.start();
    }
}
