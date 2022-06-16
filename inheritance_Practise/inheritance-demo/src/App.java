import java.util.Scanner;

public class App
{
	public static void main(String[] args) 
	{
		Shape sh=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("=================================");
		System.out.println("please select your choice");
		System.out.println("1.Find area of Circle");
		System.out.println("2.Find area of Triangle");
		System.out.println("3.Find area of Rectangle");
		System.out.println("4.Quit");
		System.out.println("=================================");
		System.out.print("please enter your choice :");
		int ch=sc.nextInt();
	
		switch (ch) 
		{
		case 1:
		{
			System.out.print("Enter Radius of cicle :");
			int r=sc.nextInt();
			sh=new Circle(r);
			sh.findShapeArea();
			break;
		}
		case 2:
		{
			System.out.print("Enter Base of triangle :");
			int b=sc.nextInt();
			System.out.print("Enter Height of triangle :");
			int h=sc.nextInt();
			sh=new Triangle(b, h);
			sh.findShapeArea();
			break;
		}
		case 3:
			System.out.println("Enter length of Rectangle :");
			int l=sc.nextInt();
			System.out.println("Enter breadth of Rectangle :");
			int b=sc.nextInt();
			sh=new Rectangle(l, b);
			sh.findShapeArea();
			break;
		case 4:
			break;
			
			default:
			{
			System.out.println("please enter a valid choice");
			}
		}

	}

}
