
public class circle 
{
	int radius;       //attribute     creating the variable
	public circle(int r)              //attribute  creating the constructor
	{
		radius=r;
	}
	public void setradius(int r)         // behaviour  it is a method
	{
		radius=r;
	}
	public int getradius()             // behaviour   it is a method
	{
		return radius;
	}
	public void showArea()            // behaviour    it is a method
	{
		double area=3.14*radius*radius;
		System.out.println("area of circle="+area);
	}
}
