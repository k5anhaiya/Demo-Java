import java.util.Scanner;    //programme to print any table

public class loopfor 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number to print=");
		int num=sc.nextInt();
		int ta;
		for(int ctr=1;ctr<=10;ctr++)
		{
			ta=num*ctr;
			System.out.println(num+"*"+ctr+"="+ta);
		}
		

	}

}
