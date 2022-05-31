
public class variableArguments 
{
	public static void show(int ...A)
	{
		for(int x:A)
		{
			System.out.println(x);
		}
	}
	public static void main(String[] args) 
	{
		show();
		show(10,20,30,40);
		show(1,2,3,4,5,6,7,8,9);
		show(new int[] {25,26,27,28,29,30});
		
	}

}
