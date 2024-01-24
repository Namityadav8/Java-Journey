// the derived class can also call the const of base class but
        // same as case of inheritance it is not vice versa
        // and if we call only derived class const of base class will also const but since it has inherited 
        //properties from base class so it will call the base const also 

class base1{
    base1(){
        
        System.out.println("inside base class");
    }
    base1( int n){
        System.out.println("Inside overloaded cosnt " + n);
    }
}

class derived2 extends base1{                                     
    derived2(){ 
        // super(13);
        //this will redirecrt to the overload. const. 
        System.out.println("inside derived class");
    }
    derived2(int m , int n){
        // super(23); // only if derived const is also argumented as we can pass derived arguments from main 
        //func itslef but have to pass base class using super .
        System.out.println("inside derived overloaded const "+ (m+n));
    }
}
public class const_inherit {
    public static void main(String[] args) {
        base1 a = new base1();
        derived2 b = new derived2(23,4);   
    }
}
