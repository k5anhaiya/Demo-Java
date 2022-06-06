import java.util.Scanner;

//print
// * * * * *
// * * * *
// * * *
// * * 
// *
public class pattern2a 
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
		System.out.print("please enter number of rows to print=");
		int k=obj.nextInt();
		for(int c=1;c<=k;c++)
		{
			for(int j=k;j>=c;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
