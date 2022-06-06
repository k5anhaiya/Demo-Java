		// how to call a method
public class AAdemo 
{
public static void method1()
	{
	System.out.println("Method1 begins");
	method2();
	method3();
	}
public static void method2()
	{
	System.out.println("Method2 begins");
	}
public static void method3()
	{
	System.out.println("Method3 begins");
	}
public static void main(String[] args) 
	{
	System.out.println("Main method");
	method1();
	}
}