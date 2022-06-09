import java.util.Scanner;

public class calculator implements myInter 
{ 
	int a,b;
	public calculator(int a,int b) 
	{
		this.a=a;
		this.b=b;
	}

	@Override
	public int sum(int a, int b) 
	{
		return (a+b);
	}

	@Override
	public int multiply(int a, int b) 
	{
		return (a*b);
		
	}

	@Override
	public int subtract(int a, int b) 
	{
		return (a/b);
	}
	

}
