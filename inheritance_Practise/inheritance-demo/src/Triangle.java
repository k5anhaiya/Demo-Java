
public class Triangle implements Shape 
{
	private int base;
	private int height;
	public Triangle(int base,int height)
	{
		this.base=base;
		this.height=height;
	}
	@Override
	public void findShapeArea() 
	{
		System.out.println("Area of Triangle :"+0.5*base*height);
	}
	
}
