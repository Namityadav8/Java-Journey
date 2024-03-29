class a extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(i);
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                System.out.println("Error");
            }
        }

    }
}
public class revise {

    public static void main(String[] args) {
        a aa = new a();
        aa.start();
    }
}