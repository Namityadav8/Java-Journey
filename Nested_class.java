class a{
    public void show(){
        System.out.println("Dikha de");
    }

    static class b
    {
        public void show1(){
            System.out.println("isme hi dikha de");
        }
        
    }
}

/**
 * Nested_class
 */
public class Nested_class {

    public static void main(String[] args) {
        a obj = new a();
        a.b obj1 = new a.b();
        obj.show();
        obj1.show1();
    }
}