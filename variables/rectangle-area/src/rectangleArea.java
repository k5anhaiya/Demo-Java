import java.util.Scanner;

public class rectangleArea 
{
	public static void main(String[] args) 
	{
		int length,breadth;
		float area;
		System.out.println("Programme to find the area of Rectangle");
		System.out.println("-----------------------------------------");
		System.out.print("Enter length=");
		Scanner scanner=new Scanner(System.in);
		length=scanner.nextInt();
		System.out.print("Enter breadth=");
		breadth=scanner.nextInt();
		
		area=length*breadth;
		System.out.print("Area of rectangle="+area);
	}
	

}
