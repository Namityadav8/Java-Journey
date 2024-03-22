class base{
    public void A(){
        System.out.println("Inside a ");
    }
    public void B(){
        System.out.println("Inside B");
    }
}

class derived extends base{
    public void A(){
        System.out.println("Inside a of derived ");
    }
    public void C(){
        System.out.println("Inside c    ");
    }
}
public class java_class {
    public static void main(String[] args) {
        base obj = new derived();
         
    }
    
}