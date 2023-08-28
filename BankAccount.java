import java.util.Scanner;

class Account
{
    int acno;
    int amount=0;
    Account(int ac,int am)
    {
        acno=ac;
        amount=am;
    }
    void setAccNo(int no)
    {
        acno=no;
    }
    void _deposit(int amt)
    {
        amount+=amt;
    }
    void _withdraw(int amt)
    {
        if(amt>amount)
            System.out.println("Don't have enough balance");
        else{
            amount-=amt;
            System.out.println("Updated balance"+amount);
        }
    }
    void check_balance()
    {
        System.out.println("Ac/No: "+acno+"\nBalance"+amount);
    }
}

class Account_D extends Account{
    String acType;

    Account_D(int ac,int am,String at)
    {
        super(ac, am); //calling the parent class contructor by super keyword
        acType=at;
    }
    void setType(String st)
    {
        acType=st;
    } 
    void display()
    {
        System.out.println(acType);
    }
}

public class BankAccount {
    public static void main(String[] args){
        Account_D acc= new Account_D(1001,10000,"Savings");
        while(true)
        {
            System.out.println("1.Deposit\n2.Withdraw\n3.Set Acc type\n4.Check Balance\n6.To Exit");
            Scanner sc= new Scanner(System.in);
            int x=sc.nextInt();
            switch(x)
            {
                case 1:
                    System.out.println("Amount to Deposit:\t");
                    int d=sc.nextInt();
                    acc._deposit(d);
                    break;
                case 2:
                    System.out.println("Amount to withdraw:\t");
                    int w=sc.nextInt();
                    acc._withdraw(w);
                    break;
                case 3:
                    System.out.println("Set Acc type to:\t");
                    String S=sc.nextLine();
                    acc.setType(S);
                    break;
                case 4:
                    System.out.println("Balance:\t");
                    acc.check_balance();
                    break;
                case 5:
                    System.exit(0);
                default: System.out.println("Wrong Input");
            }
        }
    }
}

// acc._deposit(100);
// acc.setType("Savings");
// acc.setAccNo(1);
// acc.setAccNo(1);
// acc.display();
// acc.check_balance();
// acc._withdraw(50);
// acc.check_balance();