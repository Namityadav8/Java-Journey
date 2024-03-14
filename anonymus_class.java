interface A{
    void fun();
}
public class anonymus_class {
    public static void main(String[] args) {
        A obj = new A() {
            public void fun(){
                System.out.println("Hello Class");
            }
        };

        obj.fun();
    }
}
