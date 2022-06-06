import java.util.Scanner;

public class _ifelse 
{
	
	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	int amount1=40000;
	int amount2=50000;
	System.out.println("Sender Amount before transfer="+amount1);
	System.out.println("Receiver Amount before transfer="+amount2);
	System.out.println("Enter the Amount to transfer=");
	int amount=sc.nextInt();
	if(amount<=amount1)

	amount1-=amount;
	amount2+=amount;
	System.out.println("Sender Amount after transfer="+amount1);
	System.out.println("Receiver Amount after transfer="+amount2);
	System.out.println("Amount that is transfered="+amount);
	}
	else
	{
		System.out.println("You Don't have Sufficient balance");
	}
	}

}
