import java.util.Scanner;

/*Write a class Student having following properties and methods:
Property: rollNumber, name, course, marks1, marks2, marks3
Methods: calculateTotal(), calculateAverage(), calculateGrade()
Create getter and setter methods.
Create class StudentTest with main method for calling Student class.
StudentTest should contain atleast 5 student objects with different grades.
Implement toString method to display details of each student.
Also display grades of each student.
Store the student file in a package student;
 */
public class Student {
    int rollNumber;
    String name;
    String course;
    int marks1,marks2,marks3;
    int total;
    int avg;
    public
    String getName() { return name; }
    void setName(String N)
    {
        this.name = N;
    }
    String getCourse(){return course;}
    void setCourse(String C)
    {
        this.name=C;
    }
    int getRoll(){return rollNumber;}
    void setRoll(int r)
    {
        this.rollNumber=r;
    }
    void calculateTotal(){
        total=marks1+marks2+marks3;
        System.out.println("Total="+total);
    }
    void calculateAverage(){
        avg=total/3;
        System.out.println("Average="+avg);
    }
    void calculateGrade(){
        if(avg>=91 && avg<=100)
        System.out.println("A1");
    else if(avg>=81 && avg<91)
    System.out.println("A2");
    else if(avg>=71 && avg<81)
    System.out.println("B1");
    else if(avg>=61 && avg<71)
    System.out.println("B2");
    else if(avg>=51 && avg<61)
    System.out.println("C1");
    else if(avg>=41 && avg<51)
    System.out.println("C2");
    else if(avg>=33 && avg<41)
    System.out.println("D");
    else if(avg>=21 && avg<33)
    System.out.println("E1");
    else if(avg>=0 && avg<21)
    System.out.println("E2");
    else
    System.out.println("Invalid!");
    }
    public static void main(String args[])
    {
        Student s=new Student();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rollnumber");
        s.setRoll(Integer.parseInt(sc.next()));
        System.out.println("Enter Name");
        s.setName(sc.next());
        System.out.println("Enter Course");
        s.setCourse(sc.next());
        System.out.println(s.getName()+" "+s.getRoll() + " "+s.getCourse());
        System.out.println("Enter 3 subject marks");
        // s.marks1=sc.nextInt();
        // s.marks2=sc.nextInt();
        // s.marks3=sc.nextInt();

        // s.calculateTotal();
        // s.calculateAverage();
        // s.calculateGrade();
    }
}
