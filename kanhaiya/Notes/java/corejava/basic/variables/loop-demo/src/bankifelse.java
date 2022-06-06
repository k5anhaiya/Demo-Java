import java.util.Scanner;
public class bankifelse 
	{
		public static void main(String[] args)
		{
			int amount1=50000;
			int amount2=80000;
			System.out.println("Sender balance before transfer="+amount1);
			System.out.println("Receiver balance before transfer="+amount2);
			Scanner sc=new Scanner(System.in);
			System.out.print("please enter the amount to transfer:");
			int amount=sc.nextInt();
			if(amount1>=amount)
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
