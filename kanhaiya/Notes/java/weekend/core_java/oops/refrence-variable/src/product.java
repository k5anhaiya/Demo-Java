
public class product 
{
	public int pid;
	public String name;
	public int price;
	
	public product(int a1,String a2,int a3)
	{
	pid=a1;
	name=a2;
	price=a3;
	}
	 
	//parameter t will hold refrence of the object.
	public static void showDetails(product t)   //this method will be called by programmer.
	{
		System.out.println("product id is:"+t.pid);
		System.out.println("product name is:"+t.name);
		System.out.println("product price is:"+t.price);
	}
}
