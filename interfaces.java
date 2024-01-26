interface bicycle{
    public final int b =23;
    void brake(int decreament);
    void speed(int increament);
    default void m(){
        System.out.println("say my name");
    }
   
}
abstract class Avon implements bicycle{
   public void ex(){
    System.out.println("abstract try kr rha tha ");
   }
}

class derived extends Avon implements bicycle{
    public void brake(int a){
        System.out.println("brakes laga rha hu");
    }

    public void speed(int b){
        System.out.println("or tej chalayege ab bc ");
    }
}
public class interfaces {
    public static void main(String[] args) {
        // Avon bike = new Avon();
        // bike.brake(12);
        // System.out.println(bike.b); // since it is a int value we have to store it in a other integer or print it 
       derived obj = new derived();
       obj.brake(23);
      
        
       Avon obj1 = new derived();
       obj1.ex(); // it is basically a way to access the elements of abstract class using concrete class
                // using dynamic dispatch method . 




    }
}
