
public class App
{
	public static void main(String[] args) 
	{
		//calling the interface method with the help of class by making the object of class.
//		calculator c1=new calculator();
//		c1.myMethod();
		
		//creating the object of intreface
//		App a1=new App();
//		MyInter m1=new MyInter()
//		{
//			public void myMethod() 
//			{
//				System.out.println("calling the method of interface by creating the object of MyInter");
//				
//			}
//		};
//		m1.myMethod();
		
		//calling the same thing by using lamda empression
		
		MyInter i= ()-> System.out.println("Calling from lamda expression");
		i.myMethod();
	}

}
