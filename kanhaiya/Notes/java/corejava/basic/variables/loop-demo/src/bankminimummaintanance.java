import java.util.Scanner;

public class bankminimummaintanance
{	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int amount1=40000;
		int amount2=60000;
		System.out.println("before fund transfer="+amount1);
		System.out.println("before fund transfer="+amount2);
		System.out.println("Enter transfered amount=");
		int amount=sc.nextInt();
		if((amount1)>=amount+10000)    //to maintain Rs.3000 as main balance.
			{
			amount1-=amount;
			amount2+=amount;
			System.out.println("Amount" + amount + "has been transfered");
			System.out.println("sender balance after transfer="+amount1);
			System.out.println("Receiver balance after transfer="+amount2);
			}
			else 
			{
				System.out.println("insufficient balance");	
			}

	}

}
