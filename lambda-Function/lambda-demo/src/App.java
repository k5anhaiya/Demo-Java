

public class App
{
	public static void main(String[] args) 
	{
		System.out.println("My System Starts...");
		
//		Myinterface i1=new interfaceImplemets();
//		i1.sayHello();
		
		
		//calling anonymous class
//		Myinterface i=new Myinterface() 
//		{
//			
//			@Override
//			public void sayHello() 
//			{
//				System.out.println("This is first anonymous class");
//			}
//		};
//		i.sayHello();
//		
//		Myinterface i2=new Myinterface()
//		{
//			
//			@Override
//			public void sayHello() 
//			{
//				System.out.println("This is second anonymous class");
//			}
//		};
//		i2.sayHello();
		
		
		//using our interface with the help of lambda
		Myinterface i=()-> System.out.println("This is first time i am using lambda");
		Myinterface i2=()-> System.out.println("This is Second time i am using lambda");
	
		i.sayHello();
		i2.sayHello();
	}

}
