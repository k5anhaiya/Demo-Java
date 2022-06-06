import java.util.Scanner;

public class App 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		Engine engine=null;
		System.out.println("Enter 1 for petrol Engine");
		System.out.println("Enter 2 for diesel Engine");
		System.out.println("Enter 3 for cng Engine");
		System.out.println("----------------------------");
		System.out.println("Enter your choice");
		int ch=sc.nextInt();
		if(ch==1)
		{
		engine=new PetrolEngine();
		}
		else if(ch==2)
		{
		engine=new DieselEngine();
		}
		else if(ch==3)
		{
		engine=new CngEngine();
		}
		System.out.println("=====================");
		System.out.println("Engine is ready..");
		System.out.println("=====================");
		while(true)
		{
			System.out.println("Enter 1 for start Engine");
			System.out.println("Enter 2 for stop Engine");
			System.out.println("Enter 3 to Quit");
			System.out.println("----------------------------");
			System.out.println("Enter your choice");
			ch=sc.nextInt();
			if(ch==1)
			{
				engine.StartEngine();
			}
			else if(ch==2)
			{
				engine.StopEngine();
			}
			else
			{
				System.out.println("Thank you...");
				break;
			}
		}
	}

}
