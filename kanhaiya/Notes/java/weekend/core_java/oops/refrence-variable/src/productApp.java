
public class productApp 
{
	public static void main(String[] args) 
	{
		product r1,r2,r3,r4;
		r1=new product(101,"Laptop",256);
		r2=new product(102,"Desktop",125);
		r3=new product(103,"Mouse",98);
		r4=new product(104,"Keyboard",210);
		
		product.showDetails(r1);
		product.showDetails(r2);
		product.showDetails(r3);
		product.showDetails(r4);
		
	}
}
