import java.util.Scanner;

//Write a program to find the factorial value of any number entered through the keyboard. 
public class exercise4 
{	
	public static void main(String[] args) 
	{
	Scanner sc= new Scanner(System.in);
	System.out.println("Please enter the number to find the factorial=");
	int x=sc.nextInt();
	int r=x;
	
	for(int ctr=1;ctr<x;ctr++)
		{
		r=ctr*r;
		}
     System.out.println(r);
	}

}
