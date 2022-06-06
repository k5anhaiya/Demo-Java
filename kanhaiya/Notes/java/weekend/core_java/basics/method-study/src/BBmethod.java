public class BBmethod 
{
	public static void method1()
	  {
	  	System.out.println("Method1 begins");	
		method2();
		System.out.println("Method1 ends");
	  } 
	  public static void method2()
	  {
	  	System.out.println("Method2 begins");	
		method3();
		System.out.println("Method2 ends");
	  } 
	  public static void method3()
	  {
	  	System.out.println("Method3 begins");	
		System.out.println("Method3 ends");
	  } 
	  public static void main(String [] args)
	  {
		System.out.println("Main begins");	
		method1();
		System.out.println("Main ends");
	  }
	  
}

