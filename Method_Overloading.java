public class Method_Overloading {
    void func(){
        System.out.println("hello bitches");
    }
    void func(int a){
        System.out.println("hello bitches "+ a);
    }
    public static void main(String[] args) {
       Method_Overloading a = new Method_Overloading();
        a.func();
        a.func(2);
        
    }
}
