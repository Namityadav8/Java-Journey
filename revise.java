interface a{
    public void nam();
}

public class revise {
    public static void main(String[] args) {
        a obj = () ->{
            System.out.println("Hello");
        };
        obj.nam();
    }
}