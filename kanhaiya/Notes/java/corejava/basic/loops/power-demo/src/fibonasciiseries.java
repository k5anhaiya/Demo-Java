
public class fibonasciiseries
{
	public static void main(String[] args) 
	{
		int x=1,y=1;
		System.out.println(x);
		int z;
		while(y<=20)
		{
			System.out.println(y);
			z=x+y; //2,3,5,8,13
			x=y;   //1,2,3,5,8
			y=z;   //2,3,5,8,13
		}

	}

}
