class Persons{
    String name;
    String email; 
    String phone;
    
    void set_data(String n, String e,String p){
        name=n;
        email=e;
        phone=p;
    }
}
//single inheritence                                                      
class Student extends Persons{
    int roll;
    double marks;

    void set__data(int r,double m)
    {
        roll=r;
        marks=m;
    }

    void __display()
    {
        System.out.println("Name: "+name);
        System.out.println("Email: "+email);
        System.out.println("Phone: "+phone);
        System.out.println("Roll: "+roll);
        System.out.println("Marks: "+marks);
    }
}

public class Person {
    public static void main(String[] args)
    {
        Student obj=new Student();
        obj.set_data("Shubho","shubho@gmail.com","9903247560");
        obj.set__data(1,99);

        obj.__display();
    }
}
