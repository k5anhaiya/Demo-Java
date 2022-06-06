
public class Product 
{
	private int pid;//instance variable
	 private String name;
	 private int price;
	 public Product(int pid,String name,int price)
	 {
	  this.pid=pid;
	  this.name=name;
	  this.price=price;
	 }
	 public void showProductDetails()
	 {
	  System.out.println("Product id:"+pid);
	  System.out.println("Product name:"+name);
	  System.out.println("Product price:"+price);
	  System.out.println("---------------------");
}
}
