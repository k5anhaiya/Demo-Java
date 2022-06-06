
public class Product 
{
	private int pid;   
	private String name;   
	private double price;
	
	public Product(int pid,String name,double price) //parameterized constructor
	{
	this.pid=pid;
	this.name=name;
	this.price=price;
	}
	
	public void showDetails()
	{
		System.out.println("Product id is:"+pid);
		System.out.println("Product name is:"+name);
		System.out.println("Product price is:"+price);
	}

}
