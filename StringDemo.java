
public class StringDemo {
    String x;
    StringDemo(String a)
    {
        x=a;
    }    
    void printAllChar()
    {
        for(int i=0;i<x.length();i++)
        {
            System.out.print(x.charAt(i));
        }
        System.out.println();
    }
    void reverse()
    {
        String y="";
        for(int i=x.length()-1;i>=0;i--)
        {
            y+=x.charAt(i);
        }
        System.out.println(y);
    }

    public static void main(String[] args)
    {
        StringDemo S=new StringDemo("Hello");
        S.reverse();
    }
}
