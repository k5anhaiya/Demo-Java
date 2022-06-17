
public class circle 
{
	int radius;
	double area;
	double perimeter;
	public circle(int radius)
	{
		this.radius=radius;
	}
	
	public void showArea()
	{
	 area=Math.PI*radius*radius;
	 System.out.println("Area of circle = "+area);
	}
	private void syso() {}
	public void showPerimeter()
	{
		perimeter=2*Math.PI*radius;
		System.out.println("Perimeter of circle = "+perimeter);
	}

}
