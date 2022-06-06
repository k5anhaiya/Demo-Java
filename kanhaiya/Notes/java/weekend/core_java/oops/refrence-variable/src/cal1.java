
public class cal1 
{
	int x,y,z;
	public cal1(int a1,int a2)
	{
	x=a1;
	y=a2;
	}
	
	public void add()  //here method is non static hence we don't need to give the refrence of the object
	//constructor will automatically give the refrence of the object
	{
		z=x+y;   //compiler work like this.z=this.x+this.y;
		System.out.println("add="+z);
	}
	public void multiply()   
	{
		z=x*y;
		System.out.println("multiply="+z);
	}
}
