class A implements Runnable{
    public void run(){
        for(int i=0;i<10;i++){
        System.out.println("inside thread 1.");
        try{
            Thread.sleep(100);
        }catch(Exception e){
            
        }
        }
    }
}


public class runnable_interface {
    
    public static void main(String[] args) {
        A obj = new A(); 
        

        Thread ram = new Thread(obj);
        

        ram.start();
    }   
}