import java.util.Scanner;

public class LinearSearch 
{
	public static void main(String[] args) 
	{
		int [] list= {12345,11223,12233,44556,10101,11022,11993,45678};
		Scanner sc=new Scanner(System.in);//system.in is object of BufferedInputStream
		int rn=sc.nextInt();
		boolean found=false;
		for(int x:list)
		{
			if(rn==x)
			{
				found=true;
				System.out.println("Roll number exists in the list");
				break;
			}
		}
		if(!found)
		{
			System.out.println("Roll Number not available in the list");
		}
	}

}