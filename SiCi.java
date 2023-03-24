import java.util.Scanner;
import java.math.*;
public class SiCi {
    public static void main(String args[]) {
        double principal = 10000, rate = 5, time = 2;
    double A = principal * (Math.pow((1 + rate / 100), time));
      double CI = A- principal;
      double SI= (principal*rate*time)/100;
      System.out.println("SI="+(SI)+"\nCI="+(CI));

    }
}
