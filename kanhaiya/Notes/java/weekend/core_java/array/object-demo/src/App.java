
public class App 
{
	public static void main(String[] args) 
	{
		Product p1,p2,p3,p4,p5;//5 reference variable will be created
		  p1=new Product(101,"Laptop",40000);
		  p2=new Product(102,"Dekstop",20000);
		  p3=new Product(103,"Mouse",1000);
		  p4=new Product(104,"Printer",3000);
		  p5=new Product(105,"Keyboard",1500);
		  
		  p1.showProductDetails();
		  p2.showProductDetails();
		  p3.showProductDetails();
		  p4.showProductDetails();
		  p5.showProductDetails();
	}
}
