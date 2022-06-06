
public class calculation1
{
	public static void main(String[] args) 
	{
		int x=10,y;
		y=x-- + (x-- + --x);    //10+(9+7)=10+16=26
		System.out.println("value of y="+y);
		System.out.println("value of x="+x);

	}

}
