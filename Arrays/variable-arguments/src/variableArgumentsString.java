
public class variableArgumentsString 
{
	public static void showNames(int start,String ...s)
	{
		for(String x:s)
		{
			System.out.println(start+"."+x);
			start++;
		}
	}
	public static void main(String[] args) 
	{
		showNames(1,"Kanhaiya","Hanuman","Manish","Narayan","Rishi","Harkesh");
	}

}
