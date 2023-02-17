//Tu Hi Nirankar
class A{
    private static A ob=new A();//created an instance of the same class as private
    private A(){ } //contructor is private
    public static A getA(){ return ob;} //factory method
}
public class Singleton_Class {
    public static void main(String args[]) {
        A a1=A.getA();
        A a2=A.getA();
        System.out.println("a1= "+a1);
        System.out.println("a2= "+a2);
        }
    }