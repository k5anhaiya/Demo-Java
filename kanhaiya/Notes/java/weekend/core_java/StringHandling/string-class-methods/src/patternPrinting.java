
public class patternPrinting 
{
	public static void main(String[] args) 
	{
		
		
		String str1="Kanhaiya";
		for(int r=0;r<str1.length();r++)
		{
			for(int i=0;i<=r;i++)
			{
				char ch=str1.charAt(i);
				System.out.print(ch);
			}
			System.out.println();
		}
	}
}
