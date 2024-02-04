class Mythr extends Thread{
    public Mythr(String name){
        super(name);  // it is done to pass the argument to superclass which is our thread class 
    }
    public void run(){
        System.out.println("hi");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}


public class thread_constructor {
    public static void main(String[] args) {
        Mythr a = new Mythr("namit");
        Mythr b = new Mythr("yadav");
        a.setPriority(Thread.MAX_PRIORITY);
        a.start();
        b.start();
        System.out.println("The id of thread is "+ a.getId());
        System.out.println("the name of thread is "+ a.getName());


    }
}
