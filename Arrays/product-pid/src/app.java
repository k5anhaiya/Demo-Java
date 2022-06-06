
public class app 
{
	public static void main(String[] args) 
	{
		product [] products=new product[5];
		products[0]=new product(001,"Laptop", 20000);
		products[1]=new product(002,"Monitor", 56482);
		products[2]=new product(003,"Logistics stick", 50000);
		products[3]=new product(004,"Keyboard", 150);
		products[4]=new product(005,"Mouse", 200);
		
		for(int i=0;i<products.length;i++)
		{
			products[i].showDetails();
		}
	}
}
