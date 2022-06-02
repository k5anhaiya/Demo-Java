
public class main 
{
	public static void main(String[] args) 
	{
		System.out.println("This is an example of lambda expression");
		selfinterface sf=(a,b)->a+b;
		//creating annonymous class and implementing
		//the interface in this class.
		System.out.println(sf.sum(25,25));
		System.out.println(sf.sum(5,10));
	}

}
