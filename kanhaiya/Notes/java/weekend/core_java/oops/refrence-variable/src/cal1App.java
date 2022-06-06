
public class cal1App 
{
	public static void main(String[] args) 
	{
		cal1 c1,c2,c3;    //these are the refrence variable
		c1=new cal1(10,20);
		c2=new cal1(4,7);
		c3=new cal1(5,210);
		
		c1.add();  //value of c1 will be assigned to this
		c2.add();
		c3.add();
		c1.multiply();    //value of c1 will be assigned to this.
		c2.multiply();
		c3.multiply();
	}
}
