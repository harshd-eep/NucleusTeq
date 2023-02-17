//Tu Hi Nirankar
import java.util.Scanner;
//DYNAMIC BINDNING
interface Shape{
    void area();
}
class Circle implements Shape{
    double r, pi=3.14;
    Circle(double r){ this.r=r; }
    public void area(){
        double res=pi*r*r;
        System.out.println("Area of Circle= "+res);
    }
}
class Rectangle implements Shape{
    double len,wid;
    Rectangle(double l,double w){ len=l; wid=w; }
    public void area(){
        double res=len*wid;
        System.out.println("Area of Rectangle= "+res);
    }
}
public class Dyanmic_Binding {
    public static void main(String args[]) {
        Shape ob;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 for Circle");
        System.out.println("Enter 2 for Rectangle");
        int n=sc.nextInt();
        switch(n){
            case 1:
                ob=new Circle(100);
                ob.area();
                break;
            case 2:
                ob=new Rectangle(100,100);
                ob.area();
                break;
        }
    }
}