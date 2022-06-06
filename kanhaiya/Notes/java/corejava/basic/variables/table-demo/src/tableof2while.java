import java.util.Scanner;

public class tableof2while 
	{public static void main(String[] args)
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Provide the number to print any table=");
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
