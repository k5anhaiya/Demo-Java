// ABCDEDCBA
// ABCD DCBA
// ABC   CBA
// AB     BA
// A       A
public class abcdedcba 
{
	public static void main(String[] args) 
	{
		for(int r=1;r<=5;r++)
		{
			//code to display first part
			for(int i=65;i<=70-r;i++)
			{
			System.out.print((char)i);
			}
			//code to put space(0,1,3,5,7)
			for(int s=3;s<=(2*r)-1;s++)
			{
				System.out.print(" ");
			}
			
			//code to display second part
			for(int i=70-r;i>=65;i--)
			{
				if(i!=69)
			System.out.print((char)i);
			}
			System.out.println();
		}
	}

}
