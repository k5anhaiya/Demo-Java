//print
//*
//* *
//* * *
//* * * *
//* * * * *
//* * * *
//* * *
//* *
//*
public class pattern1astric 
{
	static void method1()
	{
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	static void method2()
	{
		for(int i=0;i<4;i++)
		{
			for(int j=3;j>=i;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
	method1();
	method2();
	
	}
}
