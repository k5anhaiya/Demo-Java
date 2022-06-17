
public class App 
{
	public static void main(String[] args) 
	{
		//create object of Circle class
		circle c1=new circle(25);
		c1.showArea();
		c1.showPerimeter();
		//create object of rectangle class
		rectangle rec=new rectangle(55,20);
		//calling find area of rectangle
		rec.findArea();
		//calling find perimeter of rectangle
		rec.findPerimeter();
	}

}
