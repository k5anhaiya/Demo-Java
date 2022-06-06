import java.util.Scanner;    //programme to print any table

public class loopwhile 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number to print any table=");
		int num=sc.nextInt();
		int ta;
		int ctr=1;
		while(ctr<=10)
		{
			ta=num*ctr;
			System.out.println(num+"*"+ctr+"="+ta);
			ctr++;
		}

	}

}
