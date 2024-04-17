import java.util.*;
class A<T>{
    T a;
    void fun(T b){
        a=b;
        System.out.println(b);
    }
}
public class generics {
    public static void main(String[] args) {
        A<Integer> obj = new A<Integer>();
        A<String> obj1 = new A<String>();
        obj.fun(23);
        obj1.fun("Namit");
    }
}
