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
        super.x();
        System.out.println("B class me hu");
    } 
    public void z(){
        System.out.println("B k dusre me hu");
    }
}
public class dynamic_dispatch {

    public static void main(String[] args) {
        A obj = new B();

        // obj.y();
        obj.x();
      //  obj.z();  create error 
    }
}