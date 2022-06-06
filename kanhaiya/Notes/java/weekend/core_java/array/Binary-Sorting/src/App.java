import java.util.Scanner;

public class App 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int [] num= {1,4,6,10,25,47,60};
		System.out.println("Enter any number to search=");
		int x=sc.nextInt();
		boolean found=false;
		int noc=0;
		for(int i=0;i<num.length;i++)
		{
			noc++;
			if(x==num[i])
			{
				found=true;
				break;
			}
		}
		System.out.println("Total number of comparison="+noc);
		if(found)
		{
			System.out.println("Found");
		}
		else
		{
			System.out.println("Not Found");
		}
		
	}

}
