interface bicycle{
    void brake(int decreament);
    void speed(int increament);
}

interface ayodhya{
    void RamMandir();
    void pray();
}
 class Avon implements bicycle,ayodhya{
    public void brake(int a){
        System.out.println("laga laga brake");
    }
    public void speed(int b){
        System.out.println("or tej or tej");
    }

    public void RamMandir(){
        System.out.println("Mere Ram Aye hai ");        // either define the methods in interface
    }                                                     // or make the class abstract
    public void pray(){
        System.out.println("Sare bolo jai shree ram");
    }

}
public class interfaces {
    public static void main(String[] args) {
        Avon bike = new Avon();
        bike.brake(12);

        bike.RamMandir();
    }
}
