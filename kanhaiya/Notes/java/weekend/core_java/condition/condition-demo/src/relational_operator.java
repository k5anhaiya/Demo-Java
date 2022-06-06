public class relational_operator 
{	
	public static void main(String[] args) 
	{
	int x=10,y=10;
	boolean z=++x<=10 && ++y<=10;  //this is also called short circuit here once the
	//first condition is false then it will be short circuited & will not check the second 
	//condition
	System.out.println(x);   //the increased value of x is 11 from the 1st condition
	System.out.println(y);  // the value of y is not changed bcoz sencond conditon is not
	                         // executing due to short circuit.
	System.out.println(z);  // it will return the boolean value i.e true or false.
	}
}
