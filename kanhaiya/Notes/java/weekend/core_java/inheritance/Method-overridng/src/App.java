
public class App 
{
	public static void main(String[] args) 
	{
		//AA obj=new BB();  //here refrence of AA is taken because it is parent class
		                  //here object of BB is creating.
		//obj.greet();     //calling the method of BB
		AA obj=new CC();  //here refrence of AA is taken because it is parent class
        					//here object of CC is creating.
		obj.greet();     //calling the method of CC
		//AA obj=new DD();  //here refrence of AA is taken because it is parent class
        					//here object of DD is creating.
		//obj.greet();     //calling the method of DD
	}

}
