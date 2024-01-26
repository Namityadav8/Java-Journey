interface A{
     void func1();
}
interface B extends A{
    void func2();
}
abstract class baap implements B{

}
class beta extends baap{  // here we have extended our class baap and inherited the interfaces to class
    public void func1(){    // beta and since baap is abstract we have to define methods in beta .
        System.out.println("hello");
    }
    public void func2(){
        System.out.println("dusre ka hello");
    }
}
public class interface_inheritance {
    public static void main(String[] args) {
        beta b = new beta();
        b.func1();
        b.func2();
    }
}
