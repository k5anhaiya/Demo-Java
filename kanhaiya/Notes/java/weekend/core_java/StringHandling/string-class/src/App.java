
public class App 
{
	public static void main(String[] args) 
	{
		
		//this object is cretaed in String constant pool area in memory and is created automatically.
		String str1="CEtpa";
		String str2="CEtpa";
		
		boolean res=str1==str2;
		System.out.println(res);

		//this object of string class is created in heap memory
		String str3=new String("Cetpa");
		String str4=new String("Cetpa");
		res=str3==str4;
		System.out.println(res);
	}
}
