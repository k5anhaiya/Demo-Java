import java.util.Scanner;

public class powerofanumber 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("please Enter the value of x=");
		int x=sc.nextInt();
		System.out.print("please Enter the value to find the power of y=");
		int y=sc.nextInt();
		int r=x;
		for(int ctr=1;ctr<y;ctr++)
		{
		r=r*x;	
		}
		System.out.println("The power of "+x+" to the power "+y+" is="+r);
	}
}
