//Tu Hi Nirankar
import java.util.Scanner;

//When an exception occurs
public class Try_Catch {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter a number: ");
        a=sc.nextInt();
        System.out.println("Enter another number: ");
        b=sc.nextInt();
        System.out.println("Before Try");
        try{
            System.out.println("Inside Try");
            c=a/b;            
            System.out.println("c= "+c);
        }catch(Exception ex){
            System.out.println("Catch block: "+ex);
        }
        System.out.println("After try-catch");        
    }
}