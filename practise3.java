class A{
    public void a(){
        System.out.println("Inside the function 1");
    }

    public void b(){
        System.out.println("inside the function 2");
    }

}

class B extends A{
    public void b(){
        System.out.println("Inside overrided function 2");
    }

    public void c(){
        System.out.println("inside the function 3");
    }
}
public class practise3 {

    public static void main(String[] args) {
        A obj = new B();
        obj.b();
        obj.a();
    }
}