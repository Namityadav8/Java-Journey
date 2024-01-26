// it is done to acheive polymorphism as objects are created at runtime using method overriding .
class A{
    public void x(){
        System.out.println("A class me hu");
    }
    public void y(){
        System.out.println("A ke dusre me hu");
    }
}

class B extends A{
    public void x(){
        super.x(); // it is used to print the parent class overrided method 
        System.out.println("B class me hu");
    } 
    public void z(){
        System.out.println("B k dusre me hu");
    }
}
public class dynamic_dispatch {

    public static void main(String[] args) {
        A obj = new B(); // A is reference pointing to the new object B/

        // obj.y();
        obj.x();
        // obj.y();/// it will also work 
      //  obj.z();  create error 
    }
}