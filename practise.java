class A{
    public void x(){
        System.out.println("base class me hu");
    }
    public void y(){
        System.out.println("base k dusre me hu");
    }
}

class B extends A{
    public void x(){
        super.x();
        System.out.println("derived me hu");
    }

    public void y(){
        System.out.println("derived k dusre me hu");
    }
}
public class practise {

    public static void main(String[] args) {
        A obj = new B();
        obj.y();
 