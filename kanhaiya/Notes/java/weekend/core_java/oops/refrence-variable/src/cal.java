
public class cal 
{
	int x,y,z;
	public cal(int a1,int a2)
	{
	x=a1;
	y=a2;
	}
	
	public static void add(cal r)  //here method is static hence we need to give the refrence of the object
	//hence we are passing the refrence parameter.
	{
		r.z=r.x+r.y;
		System.out.println("add="+r.z);
	}
	public static void multiply(cal m)
	{
		m.z=m.x*m.y;
		System.out.println("multiply="+m.z);
	}
}
