class a{
    public a(){
        System.out.println("inside parent class ");
    }
    public a(int a){
        System.out.println("Inside parent class paramterised"+a);
    }
}
class b extends a{
    public b(){
        System.out.println("inside child class ");
    }
    public b(int b){
        super(23);
        System.out.println("Inside child class paramterised"+b);
    }
}
public class Complete_Revise {
        public static void main(String[] args) {
        Complete_Revise cr = new Complete_Revise();
        a aa = new a();
        b bb = new b(23);
       
        
    }
}