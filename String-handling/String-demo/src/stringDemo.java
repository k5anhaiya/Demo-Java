
public class stringDemo 
{
	public static void main(String[] args) 
	{
		String str1=new String("cetpa");
		StringBuffer str2=new StringBuffer("Infotech");
		StringBuilder str3=new StringBuilder("Noida");
		//all of the above will create char type array to keep string.
		//stringbuffer and stringbuilder class is mutuable class
		//stringbuffer is synchronised 
		//stringbuilder is non-synchronised
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	}

}
