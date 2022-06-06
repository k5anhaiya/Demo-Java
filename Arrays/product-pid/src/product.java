
public class product 
{
	private int pid;
	private String name;
	private int price;
	public product(int pid,String name,int price)
	{
		this.pid=pid;
		this.name=name;
		this.price=price;
	}
	public void showDetails()
	{
		System.out.println("Product id is="+pid);
		System.out.println("product name is ="+name);
		System.out.println("Product price is="+price);
		System.out.println("=============================");
	}

}
