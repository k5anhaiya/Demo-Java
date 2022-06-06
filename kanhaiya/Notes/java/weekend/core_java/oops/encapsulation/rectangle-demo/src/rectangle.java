
public class rectangle 
{
	private int length;
	private int breadth;
	public rectangle(int length,int breadth)
	{
	this.length=length;
	this.breadth=breadth;
	}
	public void showArea()
	{
		double area=length*breadth;
		System.out.println("area of rectangle="+area);
	}
}
