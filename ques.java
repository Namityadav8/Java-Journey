import java.util.Scanner;

public class ques {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Taking inputs in the array");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Now reversing it ");

        int y=0;
        int z=a.length/2;
        for(int i = a.length-1;i<=0;i--){
           if(a[y]==a[i]){
            break;
           }else{
            a[y] = a[i];
            y++;
           }
        }

        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
       





    }
}
