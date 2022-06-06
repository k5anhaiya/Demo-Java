import java.util.Scanner;

public class Bankapp2 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Account ac=new Account(5000);
		System.out.println("***********************");
		System.out.println("Please Enter your choice:");
		System.out.println("1.Show Balance");
		System.out.println("2.Deposit Money");
		System.out.println("3.Withdraw Money");
		System.out.println("4.Quit");
		System.out.println("***********************");
		
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:ac.showBalance();
		break;
		case 2:
			{
				System.out.println("Please Enter the amount to be deposited:");
				int k=sc.nextInt();
				ac.depositMoney(k);
			}
			break;
		case 3:
		{
			System.out.println("Please Enter the amount to be withdraw:");
			int x=sc.nextInt();
			ac.withdrawMoney(x);
		}
		break;
		case 4:break;
		}
	}

}
