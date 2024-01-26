abstract class base{
    public void x(){
        System.out.println("Base class me hu");
    }

    abstract public void greet();// here the asbtract method is created
    abstract public void sayhello();
}

abstract class derived extends base{
    public void nk(){
        System.out.println("khana kha lo gays");
    }
}

class derived2 extends base{
    public void greet(){
        System.out.println("namaste"); // here we have defined the abstract methods 
    }                                    // that's why abstract is not needed

    public void sayhello(){
        System.out.println("hello");
    }
}
public class abstract_method {
    public static void main(String[] args) {
        derived2 obj = new derived2();
        // base obj1 = new base(); // obj of abstract class can't created 
        //object of concrete class is used to access all the methods in asbtract and concrete class
        // obj.greet();
        base v = new derived2();//dynamic method dispatch : only way to access methods of abstract class 
        v.x();                  // using concrete class refer. of abstr. and obj of concrete
            
         
        
        
    
    }
}
