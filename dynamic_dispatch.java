//this is what we call dynamic method dispatch
//dont forget here method is function 
class parent{
    public void phone(){
        System.out.println("Purana phone hai...");
    }

    public void on(){
        System.out.println("tera baap hu mc ");
    }
}
class child extends parent{
    public void Smartphone(){
        System.out.println("mehnga phone hai.... ");
    }

    public void on(){
        System.out.println("ye bache ka hai ");
    }
}
public class dynamic_dispatch {
    public static void main(String[] args) {
    
    parent obj = new child();  
    // obj.Smartphone();
    obj.on();
        
    }
}

