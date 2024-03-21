class A{
    public void hello(){
        System.out.println("hello");
    }
}

class B extends A{
    public void hello(){
        super.hello();
        System.out.println("hello bahisaab");
    }

}
public class java_class {

    public static void main(String[] args) {
        B b = new B();
        b.hello();
    }
}