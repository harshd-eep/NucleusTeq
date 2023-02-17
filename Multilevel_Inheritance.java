class A{
    A(){ System.out.println("A() class-A"); }
}
class B extends A{
    B(){ System.out.println("B() class-B"); }
}
class C extends B{
    C(){ System.out.println("C() class-C"); }
}
public class Multilevel_Inheritance {
    public static void main(String args[]) {
      C ob1=new C();
    }
}