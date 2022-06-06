import java.util.Scanner;

public class App 
{
	public static void main(String[] args) 
	{
		Shape sh=null;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 for Circle");
		System.out.println("Enter 2 for Rectangle");
		System.out.println("Enter 3 for Triangle");
		System.out.println("---------------------------");
		System.out.print("Enter your choice=");
		int ch=sc.nextInt();
		if(ch==1)
		{
			System.out.print("Enter radius=");
			int r=sc.nextInt();
			sh=new Circle(r);
			
		}
		else if(ch==2)
		{
			System.out.print("Enter length=");
			int l=sc.nextInt();
			System.out.print("Enter breadth=");
			int b=sc.nextInt();
			sh=new Rectangle(l,b);
			
		}
		else if(ch==3)
		{
			System.out.print("Enter base=");
			int b=sc.nextInt();
			System.out.print("Enter height=");
			int h=sc.nextInt();
			sh=new Triangle(b,h);	
		}
		sh.findShapeArea();
	}

}
