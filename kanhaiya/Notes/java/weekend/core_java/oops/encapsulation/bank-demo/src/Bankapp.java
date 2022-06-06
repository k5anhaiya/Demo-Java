
public class Bankapp 
{

	public static void main(String[] args) 
	{
		Account ac=new Account(5000);
		  ac.showBalance();
		  ac.depositMoney(8000);
		  ac.withdrawMoney(2000);
		  ac.showBalance();

	}

}
