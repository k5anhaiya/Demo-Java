import java.util.Scanner;
public class Bankapp1 
{
	public static void main(String[] args) 

	{
		Scanner sc=new Scanner(System.in);
		  Account ac=new Account(5000);
		  while(true)
		  {
		   System.out.println("**************");
		   System.out.println("1:Show Balance");
		   System.out.println("2:Deposit Money");
		   System.out.println("3:Withraw Money");
		   System.out.println("4:Quit");
		   System.out.println("**************");
		   System.out.print("Enter your choice:");
		   int ch=sc.nextInt();
		   if(ch==1)
		    ac.showBalance();
		   else if(ch==2)
		   {
		    System.out.print("Enter amount to be depositted:");
		    int amount=sc.nextInt();
		    ac.depositMoney(amount);
		   }
		   else if(ch==3)
		   {
		    System.out.print("Enter amount to be withdrawn:");
		    int amount=sc.nextInt();
		    ac.withdrawMoney(amount);
		   }
		   else
		   {
		    System.out.println("******************************");
		    System.out.println("Thank your for visiting my bank");
		    break;
		   }
		  }
	}
}


