
public class square 
{
	private int num;
	public square(int n)
	{
		num=n;
	}
	public void square1()  //this is a non-static method as we are using instance 
                             	//variable inside the method 
	{
		int sq=num*num;
		System.out.println("Square by square1="+sq);
	}
	/*public void square2(int z)*/  // it should be static because we are not using instance variable 
	                            //inside the method
	public static void square2(int z)
	{
		int sq=z*z;
		System.out.println("Square by square2="+sq);
	}
}
