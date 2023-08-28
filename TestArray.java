import java.util.*;

class TwoDArray{
	int arr[][];
	int row;
	int col;
	TwoDArray(int r,int c)
	{
		row=r;
		col=c;
		arr=new int[row][col];
	}
	void get_TwoD_data()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter elements");
		for(int r=0;r<row;r++)
		{
			for(int c=0;c<col;c++)
			{
				arr[r][c]=sc.nextInt();
			}
		}
	}
	void display_twoD()
	{
		for(int r=0;r<row;r++)
		{
			for(int c=0;c<col;c++)
			{
				System.out.print(arr[r][c]+" ");
			}
		}  
	}
}


class Array
{
	int x[];   //declaration of an array
	int size;   //Total no of element of an array
	Array (int s)  //parameterized constructor to set the total no of elements
	{
		size=s;
		x=new int[size];  //memory allocation of an array	
	}
	void get_array_data()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter "+size+" Array elemets one by one:");
		for(int i=0;i<size;i++)
		{
			x[i]=sc.nextInt();
		}
	}
	
	void show_data()
	{
		System.out.println("The given array elements are:");
		for(int i=0;i<size;i++)
		{
			System.out.println(x[i]+" ");
		}
	}

	void linear_search(int a)
	{
		boolean flag = false;
		int ans =-1;
		for(int i=0;i<size;i++)
		{
			if(x[i]==a){
				ans=i;
				flag=true;
				break;
			}	
		}
		System.out.println("index"+ans);
	}

	void bubbleSort()
	{
		for(int i=0;i<size-1;i++)
		{
			for(int j=0;j<size-i-1;j++)
			{
				if(x[j]>x[j+1])
				{
					int temp=x[j];
					x[j]=x[j+1];
					x[j+1]=temp;
				}
			}
		}
	}

}


public class TestArray {

	public static void main(String[] args) {
		Array obj=new Array(5);
		Scanner sc= new Scanner(System.in);
		while(true)
		{

			System.out.println("1. To Initialize the Array");
			System.out.println("2. To Display the Array");
			System.out.println("1. To Search the Array");
			System.out.println("1. To Sort the Array");
			System.out.println("5. To Exit\nEnter Choice: ");
			int ch = sc.nextInt();
			switch(ch)
			{
				case 1:
					obj.get_array_data();
					break;
				case 2:
					obj.show_data();
					break;
				case 3:
					int x= sc.nextInt();
					obj.linear_search(x);
					break;
				case 4:
					obj.bubbleSort();
					break;
				default:
					System.exit(0);

			}
		}
		
		
	}

}