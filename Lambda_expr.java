@FunctionalInterface
interface a{
    void fun();
}


public class Lambda_expr {
    public static void main(String[] args) {
        a obj = () -> System.out.println("hello world");
        obj.fun();
    }
}
