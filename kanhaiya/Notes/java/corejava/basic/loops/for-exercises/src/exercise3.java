   //Write a program that prompts the user to input a positive integer. 
   //It should then print the multiplication table of that number. 
import java.util.Scanner;
public class exercise3 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Please enter the positive number to print the table=");
		int x=sc.nextInt();
		int y=1;
		for(int c=1;c<=10;c++)
			{
			y=c*x;
			System.out.println(y);
			}
	}

}
