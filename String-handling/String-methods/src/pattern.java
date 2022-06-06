
//programme to print the letter in vertical
public class pattern
{
    public static void main(String[] args) 
    {
        String str1="Kanhaiya";
        for(int i=0;i<str1.length();i++)
        {
        	for(int j=0;j<=i;j++)
        	{
            char ch=str1.charAt(j);
            System.out.print(ch);
        	}
        	System.out.println();
        }
    }
}