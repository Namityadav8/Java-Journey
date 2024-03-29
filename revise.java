class a implements Runnable{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(i);
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
}
public class revise {

    public static void main(String[] args) {
        a obj = new a();
        Thread sc = new Thread(obj);
        sc.start();
    }
}