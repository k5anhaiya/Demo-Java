
public class Account 
{
	private int amount;
	 public Account(int amount)
	 {
	  this.amount=amount;
	 }
	 public void showBalance()
	 {
	  System.out.println("****************************");
	  System.out.println("Your current balance is "+amount);
	  System.out.println("****************************");
	 }
	 public void depositMoney(int money)
	 {
	  amount+=money;
	  System.out.println("****************************");
	  System.out.println("Amount "+money+" credited into your account");
	  System.out.println("****************************");
	 }
	 public void withdrawMoney(int money)
	 {
	  System.out.println("****************************");
	  if(money>amount)
	   System.out.println("You do mot have sufficient balance");
	  else
	  {
	   amount-=money;
	   System.out.println("Amount "+money+" debited from your account");
	  }
	  System.out.println("****************************");
	 }
}
