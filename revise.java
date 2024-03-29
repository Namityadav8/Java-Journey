interface a{
    public void meth1();
}

interface b{
    public void meth2();
}
public class revise {
    public static void main(String[] args) {
        a obj = new a(){
            public void meth1(){
                System.out.println("It is Method 1");
            }
        };
        obj.meth1();
        b obj1 = new b(){
            public void meth2(){
                System.out.println("It is Method 2");
            }
        };
        obj1.meth2();

    }
    
}