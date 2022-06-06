import java.util.Scanner;

public class power 
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("please enter any number=");
		int x=obj.nextInt();
		System.out.println("please enter the number to find the power of=");
		int y=obj.nextInt();
		int z=x;
		for( int c=1;c<y;c++)
		{
			z=z*x;      //2^3=2*2*2
		}
		System.out.println(z);
	}
}
