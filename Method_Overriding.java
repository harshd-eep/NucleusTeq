//Tu HI Nirankar
//Method overloading
class A{
    //Overloading
    void f1(){ System.out.println("f1() in class-A"); }
    void f1(int i){ System.out.println("f1(int) in class-A"); }
    void f1(int i, int j){ System.out.println("f1(int,int) in class-A"); }
}
class B extends A{
    void f1(){ System.out.println("f1() in class-B"); } //overriding f1() from parent
}
public class Method_Overriding{
    public static void main(String args[]) {
      B ob1=new B();
      ob1.f1(); //it will override the parent class f1()
      ob1.f1(100);
      ob1.f1(100,200); 
    }
}
