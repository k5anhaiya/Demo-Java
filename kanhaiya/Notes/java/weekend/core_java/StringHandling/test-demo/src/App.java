import java.util.Scanner;

public class App 
{

	public static void main(String[] args) 
	{
		int h,p,b;
		System.out.print("Please enter three numbers to check the pythagoras triplet");
		System.out.print("==============================================================");
		Scanner sc=new Scanner(System.in);
		System.out.print("please enter the first number=");
		h=sc.nextInt();
		System.out.print("please enter the second number=");
		p=sc.nextInt();
		System.out.print("please enter the third number=");
		b=sc.nextInt();
		
		if(h*h==(b*b)+(p*p))
		{
			System.out.print("This is a pythagoras triplet");
		}
		else 
		{
			System.out.print("This is not a pythagoras triplet");
			
		}

	}

}
