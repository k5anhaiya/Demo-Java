import java.util.Scanner;
public class ifelse_newbanklimit 
{
	public static void main(String[] args) 
		{
		Scanner sc=new Scanner(System.in);
		int v1=22000;
		int v2=40000;
		System.out.println("Sender Amount before transfer="+v1);
		System.out.println("Receiver Amount before transfer="+v2);
		System.out.print("Enter the Amount to transfer=");
		int amount=sc.nextInt();
		if(amount>=20000 && amount<=40000) // use of && logical operator amount should be between 20000 & 40000
		{
			if(amount<=v1)
			{
			v1-=amount;
			v2+=amount;
			System.out.println("Sender Amount after transfer="+v1);
			System.out.println("Receiver Amount after transfer="+v2);
			System.out.println("Amount " +amount+ " transfered successfully");
			}
			else 
			{
				System.out.println("insufficient balance in account");
			}
		}
		else
		{
			System.out.println("Enter Amount between 20000 & 40000");
		}		
		}

}
