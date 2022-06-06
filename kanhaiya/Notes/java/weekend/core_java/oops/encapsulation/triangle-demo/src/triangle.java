
public class triangle 
{
	int base;
	int height;
	public triangle(int v1,int v2)
	{
	base=v1;
	height=v2;
	}
	
	public void showdetail()
	{
		System.out.println("base="+base);
		System.out.println("height="+height);
	}
	void showarea()
	{
		double area=0.5*base*height;
		System.out.println("area="+area);
	}
}
