
public class BB extends AA 
{
	public BB()
	{
		  //super();   this is code to call the default constructor of AA
		//we don not need to write the code this will be called automatically by compiler
			super(50); // this is code to call the parameterized constructor of AA
		System.out.println("Constructor of BB");
	}
	public static void main(String[] args) 
	{
		new BB();
	}

}
