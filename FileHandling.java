import java.io.*;

public class FileHandling(String[] args)
{
    try{
        FileWriter f= new FileWriter("C:\\Users\\Shubhojit\\Desktop\\New folder\\hello.txt");
        f.write("I love JAVA");
        f.close();
        System.out.println();
    }
    catch(Exception e)
    {
        
    }
}