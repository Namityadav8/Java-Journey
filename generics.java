

// class A<M,F>{
//     M a ;
//     F d ;
//     void fun(M b , F c ){
//         a=b;
//         d=c;
//         System.out.print(a+" ");
//         System.out.println(c);
//     }
// }



// now implementing interface using generic class
interface m<T>{    //here T is refferd to as our dataype that we will write in the main class 
        T b(T x);
}

interface a<t>{
        t fun( t a );
}

public class generics implements a<Integer>{ // this is the way to inherit the interface into it with a specific datatype
    public Integer fun(Integer a){
        return a;
    }
            public static void main(String[] args) {
            // A<Integer,String> obj = new A<>();
            // A<Integer,String>  obj1 = new A<>();
            // A<Integer,Double>  obj2 = new A<>();
            // A<Character,String>  obj3 = new A<>();
            // obj.fun(23,"Jordan");
            // obj1.fun(8,"Namit");
            // obj2.fun(23,23.344365);
            // obj3.fun('a',"A");
                generics obj = new generics();
                obj.fun(23);

        }
}