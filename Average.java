import java.util.Scanner;
public class Average {
    public static void main(String args[]) {
        int a,b;
        Scanner sc;
        sc = new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println("Average of three numbers is="+((a+b+c)/3));
    }
}
