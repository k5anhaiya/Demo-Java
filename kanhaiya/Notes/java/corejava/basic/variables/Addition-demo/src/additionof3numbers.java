import java.util.Scanner;

public class additionof3numbers
{
	public static void main(String[] args)
	{
		int num1,num2,num3,result;
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the first number=");
		num1=sc.nextInt();										
		System.out.println("please enter the second number=");
		num2=sc.nextInt();
		System.out.println("please enter the third number=");
		num3=sc.nextInt();
		result=num1+num2+num3;
		System.out.println("final result="+result);
	}

}
