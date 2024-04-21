import java.io.*;
import java.util.Scanner;
public class practise{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the folder name: ");
String foldername = sc.nextLine();
System.out.println("Enter the file name: ");
String filename = sc.nextLine();
File obj = new File("E:/LPU/Javacode/javacodes/"+foldername);
File obj1 = new File("E:/LPU/Javacode/javacodes/"+foldername+"/"+filename);
try{
obj.mkdir();
obj1.createNewFile();
FileWriter wr = new FileWriter(obj1);
System.out.println("Enter the content of the file: ");
String content = sc.nextLine();
wr.write(content);
System.out.println("Content of the file is: "+content);
wr.close();
}catch(Exception e){};
}
}