class thr extends Thread{
    public thr(String name){
        super(name); // here we are passing that name to the const of superclass.
    }
    public void run(){
        System.out.println("ram ram");
    }
}
public class constructor_thread {
    public static void main(String[] args) {
        thr a = new thr("namit");
        thr b = new thr("harsh");

        System.out.println("ID of namit is " + a.getId());
        System.out.println("name is " + a.getName());

        System.out.println("id of harsh is " + b.getId());
        System.out.println("name of harsh is " + b.getName());
    }
}