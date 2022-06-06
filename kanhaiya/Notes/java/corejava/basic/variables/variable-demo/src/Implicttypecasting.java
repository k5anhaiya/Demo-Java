
public class Implicttypecasting
{
	public static void main(String[] args) 
	{
		byte x=25;
		short y=x;    //implict type casting is done automatically according to hirerachy.
		int z=y;    // here short is automatically converted to integer value by complier.
		System.out.println(z);   //hirerachy byte-> short->int->long->float->double.
		System.out.println(y);

	}

}
