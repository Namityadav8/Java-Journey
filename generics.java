import java.util.*;
class A<T,U>{
    T a;
    void fun(T b , U c){
        a=b;
        System.out.print(b+" "+c);
    }
}
public class generics {
    public static void main(String[] args) {
        A<Integer,String> obj = new A<Integer,String>();
        A<String,Integer> obj1 = new A<String,Integer>();
        obj.fun(23,"james");
        obj1.fun("Namit",8);
    }
}
