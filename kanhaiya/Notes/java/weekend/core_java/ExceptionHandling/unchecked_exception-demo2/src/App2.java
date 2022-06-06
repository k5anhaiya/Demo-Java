import java.util.Scanner;

public class App2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first number=");
		int num1=sc.nextInt();
		System.out.print("Enter second number=");
		int num2=sc.nextInt();
		System.out.println("-------------------------");
		if(num2!=0)
		{
		int res1=num1/num2;
		System.out.println("Division:"+res1);
		}
		int res2=num1*num2;
		System.out.println("Multiplication="+res2);
		int res3=num1+num2;
		System.out.println("addition="+res3);
		int res4=num1-num2;
		System.out.println("substraction="+res4);
	}
}
