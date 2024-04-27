// class A<T extends Number>{
//     T a;
//     public void fun(T b){
//         a=b;
//         System.out.println(a.doubleValue() + a.doubleValue());
//     }
// }
import java.util.*;
class animal{
    void eat(){
        System.out.println("Animal is eating.");
    }
}

class dog extends animal{
    void eat(){
        System.out.println("dog is eating.");
    }
}

class cat extends animal{
    void eat(){
        System.out.println("cat is eating.");
    }
}

class rat extends animal{
    void eat(){
        System.out.println("rat is eating.");
    }
}
public class BoundedClass {
    public static void feed(List<? extends animal>list) {
       for(animal i: list){
            i.eat();
       }
    }
public static void main(String[] args){
    ArrayList<animal> an = new ArrayList<>();
    an.add(new animal());
    an.add(new animal());

    ArrayList<dog> d =  new ArrayList<>();
        d.add(new dog());
        d.add(new dog());
        
    }
}



