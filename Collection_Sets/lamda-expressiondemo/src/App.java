import java.util.Scanner;

public class App 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the first value=");
		int a=sc.nextInt();
		System.out.println("Please enter the second value=");
		int b=sc.nextInt();
		calculator c1=new calculator(a,b);
		c1.sum(a, b);
		c1.multiply(a, b);
		c1.subtract(a, b);

	}

}
