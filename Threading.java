//Thread can be used by 1.extending the Thread class 2.Using Runnable Interface

class T1 extends Thread{
    public void run()
    {
        System.out.println("Within Class T1");
        for(int i=1;i<=10;i++)
            System.out.println("i="+i);
    }
}
class T2 extends Thread{
    public void run()
    {
        System.out.println("Within Class T2");
        for(int j=1;j<=10;j++)
            System.out.println("j="+j);
    }
}

class T3 implements Runnable{
    public void run()
    {
        System.out.println("Within Class T3");
        for(int k=1;k<=10;k++)
            System.out.println("K="+k);
    }
}


public class Threading {
    public static void main(String[] args){
        T1 obj1=new T1();
        T2 obj2=new T2();
        obj1.start();
        obj2.start();

        T3 obj3=new T3();
        Thread obj=new Thread(obj3);
        obj.start();
    }
}
