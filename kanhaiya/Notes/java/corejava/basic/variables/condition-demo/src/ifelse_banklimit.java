import java.util.Scanner;
public class ifelse_banklimit 
{
	public static void main(String[] args) 
		{
		Scanner sc=new Scanner(System.in);
		int v1=10000;
		int v2=20000;
		System.out.println("Sender Amount before transfer="+v1);
		System.out.println("Receiver Amount before transfer="+v2);
		System.out.print("Enter the Amount to transfer=");
		int amount=sc.nextInt();
		if((amount+3000)<=v1)   //To maintain the minimum balance of bank of rupees 3000
		{
			v1-=amount;
			v2+=amount;
			System.out.println("Sender Amount after transfer="+v1);
			System.out.println("Receiver Amount after transfer="+v2);
			System.out.println("Amount " +amount+ " transfered successfully");
		}
		else
		{
			System.out.println("Maintanance Balance = 3000");
		}		
		}

}
