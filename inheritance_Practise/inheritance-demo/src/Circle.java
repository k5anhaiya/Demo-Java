
public class Circle implements Shape
{	
	private int radius;
	public Circle(int radius)
	{
		this.radius=radius;
	}
	public void findShapeArea()
	{
		System.out.println("Area of circle="+Math.PI*radius*radius);
	}

}
