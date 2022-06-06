
public class toUpperCaseExample 
{
	public static void main(String[] args) 
	{
		char [] str= {'c','e','T','P','a'};
		if(str[0]>='a' && str[0]<='z')
		{
			str[0]=(char)(str[0]-32);
		}
		
		for(int i=1;i<str.length;i++)
		{
			char ch=str[i];
			if(ch>='A' && ch<='Z')
			{
				ch=(char)(ch+32);
			}
			str[i]=ch;
		}
		
		System.out.println(str);

	}

}
