import java.util.Scanner;

public class App 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Engine sh=null;
		System.out.println("======================================");
		System.out.println("1.Petrol Engine");
		System.out.println("2.Dielse Engine");
		System.out.println("3.Cng Engine");
		System.out.println("=======================================");
		System.out.println();
		System.out.print("please Enter your choice :");
		int choice=sc.nextInt();
		if(choice==1)
			sh=new PetrolEngine();
		else if(choice==2)
			sh=new DieselEngine();
		else if(choice==3)
			sh=new CngEngine();
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("Engine is Ready..........");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
		while(true)
		{
			System.out.println("===============");
			System.out.println("1.Start Engine");
			System.out.println("2.Stop Engine");
			System.out.println("3.Quit");
			System.out.println("===============");
			System.out.print("please enter your choice :");
			choice=sc.nextInt();
			if( choice==1)
			{
				sh.startEngine();
			}
			else if( choice==2)
			{
				sh.stopEngine();
			}
			else if( choice==3)
			{
			System.out.println("Thankyou....");
			break;
			}
		}
		
	}

}
