//write a programme to provide Discount to users.
import java.util.Scanner;

public class calculate_discount 
	{public static void main(String[] args) 
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your amount=");
		double discount=0.0;
		int amount=sc.nextInt();
		if(amount>=6000)
		{
			discount=amount*0.2;
		}
		if(amount>4000 && amount<6000)
		{
			discount=amount*0.15;
		}
		if(amount>2000 && amount<4000)
		{
			discount=amount*0.1;
		}
		if(amount>1000 && amount<2000)
		{
			discount=amount*0.05;
		}
		if(amount<1000)
		{
			System.out.println("Dear customer you are not eliguble for any discount");
		}
		else
		System.out.println("Total Discount="+discount);
		}

}
