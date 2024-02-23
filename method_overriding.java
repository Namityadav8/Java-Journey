// same function as that of the base class and child class but on calling it will return the child class's
// method
class A{
    public int x(int a , int b){
        // System.out.println("shree ram");
        return a-b;
    }
}

class B extends A{
    public int x(int a , int b){
        // super.x();  it is a way of calling the base class method
        // System.out.println("Sita Maa");
        System.out.println("Hello");
        // super.x(7,5); // wont return due to return types
        return a+b; // wont be returning base class as its return type is a+b only .
    }
}
public class method_overriding {
    public static void main(String[] args) {
    
        // A a = new A();
        B b = new B();
        
        System.out.println(b.x(23, 12));
       
    }
}
