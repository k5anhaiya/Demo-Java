
public class Explicttypecasting
{
	public static void main(String[] args)
	{	
		int x=10;
		float z=56.23f;
		byte y=(byte)x;  //explict typecasting while converting the value we need to type.
		short m=(short)z;  //hirerachy double->float->long->int->short->byte
		System.out.println(y);
		System.out.println(m);
		System.out.println(z);

	}

}
