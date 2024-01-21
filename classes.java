class employee{
    int id;
    String name;
    public void func(){
        System.out.println("My id is " + id);
        System.out.println("My name is " + name);
    }
}
public class classes {
    public static void main(String[] args) {
        employee a = new employee();
        a.id =9;
        a.name = "namit";
        //setting attributes
        a.func(); 
         
    }
    
}