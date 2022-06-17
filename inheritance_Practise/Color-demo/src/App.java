import java.util.Scanner;

public class App
{
	public static void main(String[] args) 
	{
		color c1=null;
		System.out.println("======================================");
		System.out.println("1.Apple");
		System.out.println("2.Orange");
		System.out.println("3.Banana");
		System.out.println("4.Quit");
		System.out.println("please Enter your choice :");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		while(true)
		{
		if(choice==1)
		{
			c1=new apple();
			c1.showcolor();
			break;
		}
		if(choice==2)
		{
			c1=new Orange();
			c1.showcolor();
			break;
		}
		if(choice==3)
		{
			c1=new banana();
			c1.showcolor();
			break;
		}
		if(choice==4)
		{
			break;
		}
		}
	}
	

}
