
public class App2 
{
	public static void main(String[] args) 
	{
		Product [] p=new Product[6];//This array will hold reference of Product class objects
		  p[0]=new Product(101,"Laptop",40000);
		  p[1]=new Product(102,"Dekstop",20000);
		  p[2]=new Product(103,"Mouse",1000);
		  p[3]=new Product(104,"Printer",3000);
		  p[4]=new Product(105,"Keyboard",1500);
		  p[5]=new Product(106,"Keyboard",1500);
		  
		  for(int i=0;i<p.length;i++)
		   p[i].showProductDetails();
	}
}
