
public class squareApp 
{
	public static void main(String[] args) 
	{
		square obj=new square(25);
		obj.square1();
		/*obj.square2(10); */ //but here unneccessary we are giving refrence of the object for that
		//we are creating the object also.
		square.square2(15);   //static method will be called by classname.directly.
	}
}
