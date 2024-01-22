class base{
    public static void setint(int n){
        int b = n ;
    }
    public static int getint(){
        return b;
        System.out.println("i'am in base class ");
    }
}
class derived extends base{

}
public class inheritance {
    public static void main(String[] args) {
        base b = new base();
        b.setint(234);
        System.out.println(b.getint());
    }
}