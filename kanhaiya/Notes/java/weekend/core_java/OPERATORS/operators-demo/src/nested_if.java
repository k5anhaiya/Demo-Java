import java.util.Scanner;

public class nested_if 
{
	public static void main(String[] args) 
	{
	System.out.print("Please Enter the amount to check the discount=");
	Scanner obj=new Scanner(System.in);
	double discount=0.0;
	int amount=obj.nextInt();
		if(amount>=6000)
			{
				discount=amount*0.20;
			}
		else 
			{
				if(amount>=4000 && amount<6000)
				{
				discount=amount*0.15;
				}
			else 
				{
					if(amount>=2500 && amount<4000)
					{
					discount=amount*0.10;
					}
				else
					{
					if(amount>=1000 && amount<2500)
					{
						discount=amount*0.05;
					}
				}
				
			}
		}
		
		System.out.println("Total discount="+ discount);
	}
}
