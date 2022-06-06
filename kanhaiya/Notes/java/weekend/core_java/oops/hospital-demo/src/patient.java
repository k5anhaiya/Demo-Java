
public class patient 
{
	//code to create variable
	String firstname;
	String lastname;
	double weight;
	double height;
	int age;
	
	//code to assign values to the variable
	public patient(String v1, String v2, double v3, double v4, int v5)//it is a constructor
	{
	firstname=v1;
	lastname=v2;
	weight=v3;
	height=v4;
	age=v5;
	}
	
	//code to display the values of these variables
	public void showDetails()// it is a method
	{
		System.out.println(".............Patient Details one by one................");
		System.out.println("first name is:"+firstname);
		System.out.println("Last name is:"+lastname);
		System.out.println("weight is:"+weight);
		System.out.println("height is:"+height);
		System.out.println("age is:"+age);
	}
	
}
