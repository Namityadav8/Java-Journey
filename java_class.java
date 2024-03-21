class A{
    public A(int a ){
        System.out.println("value of a is "+a);
    }
    public A(){
        System.out.println("Necessary to have default const as there is a default in extended one ");
    }
}

class B extends A{
    public B(){
        super(34);
        System.out.println("Inside class B");
    }

    public B(int b){
        System.out.println("The value of b is "+b);
    }
}
public class java_class {

    public static void main(String[] args) {
        B b = new B(323);
    }
}