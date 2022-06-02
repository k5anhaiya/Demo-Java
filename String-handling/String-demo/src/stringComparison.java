
public class stringComparison 
{
	public static void main(String[] args) 
	{
		String str1=new String("cetpa");
		String str2=new String("cetpa");
		String str3="cetpa";
		String str4="cetpa";
		boolean res;

		
		res=str1==str2;
		System.out.println("str1 & str2 comparison");
		System.out.println(res);
		System.out.println("str3 & str4 comparison");
		res=str3==str4;
		System.out.println(res);

	}

}
