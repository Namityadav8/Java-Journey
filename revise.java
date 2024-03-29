interface a{
    public void nam(int a );
}

public class revise {
    public static void main(String[] args) {
        a obj = (int a) ->{
            System.out.println("The value chosen is "+a);
        };
        obj.nam(34);
    }
}