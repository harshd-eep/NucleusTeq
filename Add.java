import java.util.Scanner;
public class Add {
    public static void main(String args[]) {
        int a,b;
        Scanner sc;
        sc = new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        int c=a+b;
        System.out.println("a+b="+c);
    }
}
