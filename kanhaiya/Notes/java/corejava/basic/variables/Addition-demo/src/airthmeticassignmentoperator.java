import java.util.Scanner;
public class airthmeticassignmentoperator
	{public static void main(String[] args)
		{
		Scanner sc=new Scanner(System.in);
		
		int num1=40000;
		int num2=70000;
		System.out.println("Total amount of sender before transfer="+num1);
		System.out.println("Total amount of receiver before transfer="+num2);
		System.out.println("Enter the amount to transfer:");
		int num=sc.nextInt();
		num1-=num;			//num1=num1-num  these are called airthmetic assignment operator
		num2+=num;			//num2=num2+num these are called airthmetic assignment operator
		System.out.println("Total balance of sender after transfer="+num1);
		System.out.println("Total balance of receiver after transfer="+num2);
			}
	}