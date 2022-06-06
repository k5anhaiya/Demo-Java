import java.util.Scanner;

public class astricPattern 
{
	public static void main(String[] args) 
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("please enter row number=");
		int f=obj.nextInt();
		;
		for(int c=0;c<f;c++)
		{
			for(int d=0;d<=c;d++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}