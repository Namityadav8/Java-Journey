interface car{
    void company(); //one interface is having diff. forms in diff class
}                   // each func can only access its defined methods and func in interface

class toyota implements car{
    public void company(){
        System.out.println("fartuner vali hai");
    }
}

class tesla extends toyota implements car{ // still it will call its own method defined in its class
    public void company(){
        System.out.println("elon musk vali ");
    }
}
public class polymorphism {
 
        public static void main(String[] args) {
        car b = new toyota();
        car c = new tesla();
        b.company();   // interface cant make objects here it is only reffering to interface 
        c.company();
    }
}