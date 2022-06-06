import java.util.Scanner;

public class banktransfer 
	{
	   public static void main (String[] args)
	{
		   Scanner sc=new Scanner(System.in);
		   int amount1=45000;
		   int amount2=70000;
		   System.out.print("Enter the amount to be transfered=");
		   int amount= sc.nextInt();
		   amount1=amount1-amount;
		   amount2=amount2+amount;
		   System.out.println("Amount "+amount+" has been transfered");
		   System.out.println("Total balance of sender="+amount1);
		   System.out.println("Total balance of receiver="+amount2);
		   
	 }

		}
