import java.util.Scanner;

public class discount_nested
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your amount=");
		int amount=sc.nextInt();
		double discount=0.0;
		if(amount>=6000)
		{
			discount=amount*0.2;
		}
		else
		{
			if(amount>=4000)
			{
				discount=amount*0.15;
			}
			else
			{
				if(amount>=3000)
				{
					discount=amount*0.1;
				}
				else 
				{
					if(amount>=2000)
					{
						discount=amount*0.05;
					}
					else
					{
						System.out.println("Dear customer you are not eligible for any Discount");
					}
				}
					
			}
		}
		if(amount>=1000)
		{
			System.out.println("Total discount="+discount);
		}
	}

}
