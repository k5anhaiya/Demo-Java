package equals;

public class App 
{
	public static void main(String[] args) 
	{
		myString str1=new myString("cetpa");
		myString str2=new myString("cetpa");
		System.out.println("Equals method");
		boolean bt1=str1.equals(str2);
		System.out.println(bt1);
		System.out.println("Printing of ==");
		boolean bt2=str1==str2;
		System.out.println(bt2);
		
		String str3=new String("Cetpa");
		String str4=new String("Cetpa");
		
		System.out.println("Equals method");
		boolean bt3=str3.equals(str4);
		System.out.println(bt3);
		System.out.println("Printing of ==");
		boolean bt4=str3==str4;
		System.out.println(bt4);
	}

}
