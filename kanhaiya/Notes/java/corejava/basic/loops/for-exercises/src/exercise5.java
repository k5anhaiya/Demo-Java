import java.util.Scanner;

//Two numbers are entered through the keyboard.
//Write a program to find the value of one number raised to the power of another. 
//(Do not use Java built-in method)
public class exercise5 
{
	public static void main(String[] args) 
	{
	Scanner kanh=new Scanner(System.in);
	System.out.print("please enter a number=");
	int x=kanh.nextInt();
	System.out.print("please enter the power value of the entered number=");
	int y=kanh.nextInt();
	int r=x;
	
	for(int c=1;c<y;c++)
		{
		r=r*x;
		}
	System.out.println(r);
	}

}
