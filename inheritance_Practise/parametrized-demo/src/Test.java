
public class Test
{
	int a, b;
	Test()
	{
		this(10,20);
		System.out.println("inside default constructor\n");
	}
	Test(int a,int b)
	{
		this.a=a;
		this.b=b;
		System.out.println("Inside parametrized constructor");
	}
	public static void main(String[] args) 
	{
		Test object=new Test();
		
	}

}
