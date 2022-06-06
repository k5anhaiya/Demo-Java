
public class calApp 
{
	public static void main(String[] args) 
	{
		cal c1,c2,c3;    //these are the refrence variable
		c1=new cal(10,20);
		c2=new cal(4,7);
		c3=new cal(5,210);
		
		cal.add(c1);  //code to call add method
		cal.add(c2);
		cal.add(c3);
		cal.multiply(c1);    //code to call multiply method.
		cal.multiply(c2);
		cal.multiply(c3);
	}
}
