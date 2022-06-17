import java.util.Scanner;

public class App 
{
	
	static int sum(int a,int b)
	{
		System.out.println("sum ="+(a+b));
		return(a+b);
	}
	static int multiply(int a, int b)
	{
		System.out.println("Mulitply ="+(a*b));
		return(a*b);
	}
	static int division(int a,int b)
	{
		System.out.println("Division ="+(a/b));
		return(a/b);
	}
	public static void main(String[] args) 
	{
		
		int a=67;
		int b=78;
		App.sum(a, b);
		App.multiply(a, b);
		App.division(a, b);
	}

}
