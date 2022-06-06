import java.util.Scanner;   // programme to print the table using addition method

public class App 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any number=");
		int num=sc.nextInt();
		int ta=0;
		for(int ctr=1;ctr<=10;ctr++)
		{
			ta=ta+num;
			System.out.println(ta);
		}

	}

}
