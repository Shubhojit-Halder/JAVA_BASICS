import java.util.*;
class Student{
    int roll;
    String name;
    float marks;
    static String college="MSIT";
    Student() //constructor
    {
        roll=0;
        marks=0;
        name="hello";
    }
    Student(int r,String n,int m) // parameterized constructor
    {
        roll=r;
        marks=m;
        name=n;
    }
    Student(Student X) // copy constructor
    {
        roll=X.roll;
        marks=X.marks;
        name=X.name;
    }

    
    
    void set_data(int r,String n,float m){
        roll=r;
        name=n;
        marks=m;
    }

    void get_data()
    {
        System.out.println(roll);
        System.out.println(name);
        System.out.println(marks);
        System.out.println(college);
    }

    static void display(){
        System.out.println("Hello from Student Class");
    }
}

public class StudentDemo{
    public static void main(String[] args)
    {
        Student obj= new Student(1,"Shubho",99);
        Student obj1= new Student();
        Student obj2= new Student(obj);
        // obj.get_data();
        // obj1.get_data();
        obj2.get_data();
        Student.display();

    }
}