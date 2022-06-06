import java.util.Scanner;

public class App 
{
	public static void main(String[]args)
	{
	Scanner obj=new Scanner(System.in);
	System.out.print("Enter the first number=");
	int a=obj.nextInt();
	System.out.print("Enter the second number=");
	int b=obj.nextInt();
	int add=a+b;
	int sub=a-b;
	int mutli=a*b;
	int div=a/b;
	System.out.println("add="+add);
	System.out.println("sub="+sub);
	System.out.println("Mutli="+mutli);
	System.out.println("divide="+div);
	}

}
