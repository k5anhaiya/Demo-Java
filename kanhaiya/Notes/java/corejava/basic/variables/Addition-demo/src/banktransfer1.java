import java.util.Scanner;

public class banktransfer1 
	{public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int amount1=6000;
		int amount2=5000;
		System.out.println("Total amount of sender before transfer="+amount1);
		System.out.println("Total amount of receiver befor transfer="+amount2);
		System.out.print("Enter the amount to transfer=");
		int amount=sc.nextInt();
		amount1=amount1-amount;
		amount2=amount2+amount;
		System.out.println("Total amount of sender after transfer="+amount1);
		System.out.println("Total amount of receiver after transfer="+amount2);
		
	}

		}
