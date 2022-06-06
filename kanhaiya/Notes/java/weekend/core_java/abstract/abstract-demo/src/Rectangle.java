public class Rectangle 
{
	private int length;
	private int breadth;
	public Rectangle(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	public void findRectangleArea()
	{
		int area=length*breadth;
		System.out.println("Area of Rectangle="+area);
	}

}
