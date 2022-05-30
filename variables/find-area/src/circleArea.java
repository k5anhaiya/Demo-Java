import java.util.Scanner;

public class circleArea 
{
	int radius;
	public circleArea(int r)
	{
		this.radius=r;
	}
	void showArea()
	{
		float area=(float)3.14*radius*radius;
		System.out.println("Area of circle="+area);
	}
	void setRadius(int r)
	{
		radius=r;
	}
	
	public static void main(String[] args) 
	{
		System.out.println("find the area of circle");
		System.out.println("------------------------");
		System.out.println("please enter radius of circle=");
		Scanner scanner=new Scanner(System.in);
		int radius=scanner.nextInt();
		circleArea cr=new circleArea(radius);
		cr.showArea();
		cr.setRadius(25);
		
		
		
		

	}

}
