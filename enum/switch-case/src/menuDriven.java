import java.util.Scanner;

public class menuDriven
{

	public static void main(String[] args) 
	{
		System.out.println("Programme to perform airthmetic assigment operator");
		System.out.println("please enter first number :");
		Scanner scanner=new Scanner(System.in);
		int num1,num2,res;
		
		num1=scanner.nextInt();
		System.out.println("please enter second number :");
		num2=scanner.nextInt();
		System.out.println("====================================================");
		System.out.println("================Please enter your choice=============");
		System.out.println("====================================================");
		System.out.println("1.To perform Add");
		System.out.println("2.To perform subtract");
		System.out.println("3.To perform Mulitply");
		System.out.println("4.To perform Divide");
		System.out.println("5.To Quit");
		int choice=scanner.nextInt();
		while(true)
		{
			switch(choice)
			{
				case 1:
				{
				res=num1+num2;
				System.out.print("Addition="+res);
				break;
				}
				case 2:
				{
					res=num1-num2;
					System.out.print("Subtraction="+res);
					break;
				}
				case 3:
				{
					res=num1*num2;
					System.out.print("Multiplication="+res);
					break;
				}
				case 4:
				{
					res=num1/num2;
					System.out.print("divide="+res);
					break;
				}
				case 5:
				{
					break;
				}
			}
			break;
		}
		
	}

}
