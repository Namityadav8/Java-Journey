import java.util.Scanner;
public class practise {

     int a (int a,int b){
        int c=a+b;
        return c;
    }
    void m(){
        System.out.println("Fuck you");
    }
    
    public static void main(String[] args) {
        Scanner b = new Scanner(System.in);
        // int [][] a = new int[2][3];
        // for(int i=0;i<a.length;i++){
        //     for(int j=0;j<a[i].length;j++){
        //         a[i][j] = b.nextInt();
        //     }
        //      System.out.println("");
        // }

        // System.out.println("these numbers you have chosen in array");
        // for(int i=0;i<a.length;i++){
        //     for(int j=0;j<a[i].length;j++){
        //         System.out.print(a[i][j]);
        //         System.out.print(" ");
        //     }
        //      System.out.println("");
        // }
        // int a = 3;
        // System.out.println("the value is " + a);
        practise x = new practise();
        int c = x.a(3,4);
            x.m();  
        System.out.println(c);




    }   
}