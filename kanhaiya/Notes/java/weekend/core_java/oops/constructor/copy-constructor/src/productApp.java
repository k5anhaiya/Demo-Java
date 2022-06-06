
public class productApp 
{
	public static void main(String[] args) 
	{
	Product obj=new Product(101,"Laptop",5300);
	//i want to copy the first object to second object1
	Product obj1=new Product(obj);
	obj.showDetails();
	obj1.showDetails();
	}

}
