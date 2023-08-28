import java.util.*;
interface display{
    void show();
}
interface display1{
    void show200();
}
interface display_new extends display,display1{ //multiple inheritence using interface
    void show100();
}
class TestIn implements display_new{
    public void show(){
        System.out.println("Show func");
    }
    public void show100(){
        System.out.println("Show func 100");
    }
    public void show200(){
        System.out.println("Show func 200");
    }
}
public class TestInterface {
    public static void main(String[] args)
    {
        TestIn obj=new TestIn();
        obj.show();
        obj.show100();
        obj.show200();
    }    
}
