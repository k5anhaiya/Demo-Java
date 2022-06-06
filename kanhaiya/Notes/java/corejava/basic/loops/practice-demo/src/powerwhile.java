import java.util.Scanner;

import javax.security.sasl.SaslClient;

public class powerwhile 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number to find the power=");
		int x=sc.nextInt();
		System.out.println("Enter the power value=");
		int y=sc.nextInt();
		int r=x;
		int c=1;
		while(c<y)
		{
			r=r*x;
			c++;
		}
		System.out.println("Result="+r);
	}
}
