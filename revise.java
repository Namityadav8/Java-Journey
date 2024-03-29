interface A{
    public void hello();
}
public class revise {
    public static void main(String[] args) {
        A obj = () ->
            {
                System.out.println("ha bhai ");
            };
        

        obj.hello();
    }
}