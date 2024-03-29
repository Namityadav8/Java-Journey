interface A{
    public void hello();
}
public class revise {
    public static void main(String[] args) {
        A obj =  new A(){
            public void hello(){
                System.out.println("HEllo hi");
            }
        };

        obj.hello();
    }
}