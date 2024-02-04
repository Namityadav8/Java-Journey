class Mythr extends Thread{
    public Mythr(String name){
        super(name);  // it is done to pass the argument to superclass which is our thread class 
    }
    public void run(){
        System.out.println("hi");
    }

}


public class thread_constructor {
    public static void main(String[] args) {
        Mythr a = new Mythr("namit");
        Mythr b = new Mythr("yadav");

        a.start();
        b.start();
        System.out.println("The id of thread is "+ a.getId());
        System.out.println("the name of thread is "+ a.getName());

        
    }
}
