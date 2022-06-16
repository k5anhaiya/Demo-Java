import java.util.Scanner;

public class app 
{
	public static void main(String[] args) 
	{
		AirthmeticTask sh=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter your choice");
		System.out.println("==========================");
		System.out.println("1.add");
		System.out.println("2.subtract");
		System.out.println("3.multiply");
		System.out.print("please enter your choice:");
		int ch=sc.nextInt();
		switch (ch)
		{
		case 1:
		{
			System.out.println("please enter first number:");
			int num1=sc.nextInt();
			System.out.println("please enter second number");
			int num2=sc.nextInt();
			sh=new addition();
			sh.calculate(num1, num2);
			break;
		}	
		case 2:
		{
			System.out.println("please enter first number:");
			int num1=sc.nextInt();
			System.out.println("please enter second number");
			int num2=sc.nextInt();
			sh=new subtract();
			sh.calculate(num1, num2);
			break;
		}	
		case 3:
		{
			System.out.println("please enter first number:");
			int num1=sc.nextInt();
			System.out.println("please enter second number");
			int num2=sc.nextInt();
			sh=new mulitply();
			sh.calculate(num1, num2);
			break;
		}	

		}

	}

}
