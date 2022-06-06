
public class Triangle 
{
	private int base;
	private int height;
	public Triangle(int base,int height)
	{
		this.base=base;
		this.height=height;
	}
	public void findTrianlgeArea()
	{
		double area=0.5*base*height;
		System.out.println("Area of Traingle="+area);
	}

}
