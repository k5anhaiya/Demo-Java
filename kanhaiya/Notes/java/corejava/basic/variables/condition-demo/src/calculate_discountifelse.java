import java.util.Scanner;

public class calculate_discountifelse 
	{public static void main(String[] args) 
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your amount=");
		double discount=0.0;
		int amount=sc.nextInt();
		if(amount>=6000)                 // this is called  nested if else
		{
			discount=amount*0.2;
		}
		else
			{
			if(amount>4000)
				{
				discount=amount*0.15;
				}
			else
				{
				if(amount>2000)
				{
					discount=amount*0.1;
				}
				else
					{
					if(amount>1000 && amount<2000)
						{
						discount=amount*0.05;
						}
					}
				}
			}
		
		if(amount>1000)
		{
			System.out.println("Total Discount="+discount);
		}
		}
}
