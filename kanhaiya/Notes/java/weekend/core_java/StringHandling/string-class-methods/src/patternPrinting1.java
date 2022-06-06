
public class patternPrinting1 
{
	public static void main(String[] args) 
	{
		
		//this object is cretaed in String constant pool area in memory and is created automatically.
		String str1="CETPA";
		for(int i=0;i<str1.length();i++)
		{
		char ch=str1.charAt(i);
		System.out.println(ch);
		}
	}
}
