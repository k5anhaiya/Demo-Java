import java.util.Scanner;

public class AirthmeticTask 
{
	protected int num1;     //all the common code will be written in this code.
	protected int num2;
	protected int res;
	Scanner sc=new Scanner(System.in);
	public void acceptNumbers()
	{
	System.out.print("Enter 1st number=");
	num1=sc.nextInt();
	System.out.print("Enter 2nd number=");
	num2=sc.nextInt();
	}
	public void ShowDetails()
	{
		System.out.println("Result="+res);
	}


}
