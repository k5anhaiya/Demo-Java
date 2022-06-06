import java.util.Scanner;

public class App 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the amount to credit the money=");
		int num1=sc.nextInt();
		System.out.println("please enter the amount to credit the money=");
		int num2=sc.nextInt();
		int total=num1+num2;
		System.out.println("total credit amount in the bank="+total);

	}

}
