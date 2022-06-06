import java.util.Scanner;

public class namePrint
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the name to print 10 times=");
	String name=sc.nextLine();
	for(int ctr=1;ctr<=10;ctr++)
	{
		System.out.println(name);
	}

	}

}
