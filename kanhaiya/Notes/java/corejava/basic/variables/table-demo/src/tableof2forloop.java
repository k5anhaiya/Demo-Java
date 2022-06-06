import java.util.Scanner;

public class tableof2forloop
	{public static void main(String[] args)
		{
		Scanner sc=new Scanner(System.in);
		System.out.print("Please enter the table of which you are looking for=");
		int num=sc.nextInt();
		int ta;
		for(int ctr=1;ctr<=100;ctr++)
			{
			ta=num*ctr;
			System.out.println(num+"*"+ctr+"="+ta);
			}
		}
	}
