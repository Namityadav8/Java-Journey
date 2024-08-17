
class a{
    public void ret(){
        System.out.println("HELLO");
    }
}
class b extends a{
    public void ret1(){
        System.out.println("HELELEO");
    }
}
public class Complete_Revise {
    
    public static void main(String[] args) {
        Complete_Revise cr = new Complete_Revise();
        a aa = new a();
        b bb = new b();
        bb.ret();
        
    }
}