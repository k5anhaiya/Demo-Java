
public class increamentdecreament
{
	public static void main(String[] args)
	{
		int x=10,y,z,f;
		z=x++;            //this is postfix increament will increase & return the old value
		y=++x;          //this is prefix increament will increase & return the new value
		f=x;               //printing the value of updated value of x
		 System.out.println(z);
		 System.out.println(y);
		 System.out.println(f);

	}

}
