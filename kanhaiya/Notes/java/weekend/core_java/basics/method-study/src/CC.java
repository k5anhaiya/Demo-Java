import java.util.Scanner;
public class CC
{
	private static void add()  
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Please enter the number 1=");
	int num1=sc.nextInt();
	System.out.println("Please enter the number 2=");
	int num2=sc.nextInt();
	int result;
	result=num1+num2;
	System.out.println("Result="+result);
	}
	public static void show()
	{
		add();                     // to call add method;
	}
	public static void abc()  //                modifier static return type methodname()
	{
		show();
	}
public static void main(String[] args) 
{
	abc();
}
}
