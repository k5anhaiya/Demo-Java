
public class App 
{
	public static void main(String[] args) 
	{
		/*Addition obj=new Addition(10,20);
		int res=obj.sum();
		System.out.println("Sum="+res);*/
		/*Addition obj=new AdditionPlus(10,20,30);*/  //we can take refrence variable of
		                                              // the parent class also.
		AdditionPlus obj=new AdditionPlus(10,20,30);
		int res=obj.sum();
		System.out.println("Sum="+res);

	}

}
