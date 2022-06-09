import java.util.Scanner;

public class AirthmeticTask 
{
	protected int num1;
	protected int num2;
	protected int res;
	protected int ch;
	Scanner sc=new Scanner(System.in);
	public void acceptNumbers()
	{
		System.out.print("Enter 1st Number=");
		num1=sc.nextInt();
		System.out.print("Enter 2nd Number=");
		num2=sc.nextInt();
		
	}
	public void showDetails()
	{
		System.out.println("Result="+res);
	}
	
	public static void main(String[] args) 
	{
		Scanner sc1=new Scanner(System.in);
		AirthmeticTask tt=new AirthmeticTask();
		tt.acceptNumbers();
		System.out.print("please enter your choice:");
		System.out.println("============================");
		System.out.println("1.add");
		System.out.println("2.subtract");
		System.out.println("3.multiply");
		System.out.println("4.divide");
		int ch=sc1.nextInt();

			switch(ch)
			{
			case 1:
			{
				System.out.println("programme add");
				break;
			}
			case 2:
			{
				System.out.println("programme substract");
				break;
			}
			case 3:
			{
				System.out.println("programme multiply");
				break;
			}
			case 4:
			{
				System.out.println("programme divide");
				break;
			}
			}		
	}
}
