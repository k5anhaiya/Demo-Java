import java.util.Scanner;

public class addition
{
	public static void main(String[] args)
	{
		int num1,num2,result;
		Scanner sc=new Scanner(System.in); //Scanner sc=new Scanner(System.in)-->used to take input
		System.out.println("PLEASE ENTER THE FIRST NUMBER");
		num1=sc.nextInt();             //Sc.nextInt()   ------->used to save the number in variables
		System.out.println("PLEASE ENTER THE SECOND NUMBER");
		num2=sc.nextInt();
		result=num1+num2;
		System.out.println("FINAL ANSWER="+result);
	}
	
		}