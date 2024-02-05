class namit extends Thread{
    public void run(){
        System.out.println("Hello");
    }

    public namit(String name){
        super(name); // since it is derived class this name is passed to base class 
    }
}
public class practise1 {
    public static void main(String[] args) {
        namit yadav = new namit("kesar"); // passed to thread
        yadav.start();
        System.out.println(yadav.getName()); //
    }
}
