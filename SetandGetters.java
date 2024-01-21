 class namit{
    private int id;      // this method is basically used for data hiding 
    private String name;

    public void setname(String a){
        name = a ;
    }
    public String getname(){
        return name ;
    } 

    public void setid(int b){
        id = b;
    }

    public int getid(){
        return id ;
    }
 } 
public class SetandGetters {
    public static void main(String[] args) {
        SetandGetters a = new SetandGetters();
        namit b = new namit();

        b.setname("hello");
        b.setid(23);
        System.out.println(b.getid());
        System.out.println(b.getname());
      




    }
}
