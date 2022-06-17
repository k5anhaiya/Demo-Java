
public class rectangle 
{
	private int length;
	private int breadth;
	double area;
	double perimeter;
	public rectangle(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	public void findArea()
	{
		area=length*breadth;
		System.out.println("Area of Rectangle = "+ area);
	}
	public void findPerimeter()
	{
		perimeter=2*(length+breadth);
		System.out.println("Perimeter of Rectangle = "+perimeter);
	}

}
