//Tu HI Nirankar
//Method overloading
class A{
    void f1(){ System.out.println("f1() in class-A"); }
    void f1(int i){ System.out.println("f1(int) in class-A"); }
    void f1(int i, int j){ System.out.println("f1(int,int) in class-A"); }
}
public class Method_Overloading {
    public static void main(String args[]) {
      A ob1=new A();
      ob1.f1();
      ob1.f1(100);
      ob1.f1(100,200);
    }
}