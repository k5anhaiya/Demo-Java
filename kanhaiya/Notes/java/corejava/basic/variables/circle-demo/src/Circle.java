public class Circle 
{
	private int radius;                         // it is recommended that used private to hide the variable
	public Circle(int x)
	{
		radius=x;
	}
	public void showArea()
	{
		double area=3.14*radius*radius;
		System.out.println("Area of circle="+area);
	}
	public void showPerimeter()
	{
		double perimeter=2*3.14*radius;
		System.out.println("Perimeter of circle="+perimeter);
	}

}
