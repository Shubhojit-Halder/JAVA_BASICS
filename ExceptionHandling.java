class ExceptionDemo{
    void calculate(int x,int y)
    {
        try{
            System.out.println(x+"/"+y+"="+x/y);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        catch(Exception e1)
        {
            System.out.println("This is a generic Exception");
        }
        finally{
            System.out.println("This block will always be executed!");
        }
    }
}
public class ExceptionHandling {
    public static void main(String[] args)
    {
        ExceptionDemo obj=new ExceptionDemo();
        obj.calculate(0, 1);
    }
}
