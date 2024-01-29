class thr extends Thread{

    public thr(String name){
       super(name); // here it is used to call the constructor of superclass 
    }
    public void run(){
        System.out.println("jai shree ram");
    }
}

public class constructor_thread {
    public static void main(String[] args) {
        thr obj = new thr("Namit");

        System.out.println("thread id is " + obj.getId());
        System.out.println("thread name is " + obj.getName());
    }
}
