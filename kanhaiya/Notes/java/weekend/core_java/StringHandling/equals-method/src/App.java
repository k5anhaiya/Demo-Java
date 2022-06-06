
public class App 
{

	public static void main(String[] args) 
	{
		myString str1=new myString("cetpa");  //here we are creating object of myString class defined by us
		myString str2=new myString("cetpa");
		
		String str3=new String("cetpa");      //here we are creating object of string class which is already defined by java
		String str4=new String("cetpa");
		
		boolean res1=str1.equals(str2);    //equals() method of object class compares the reference of two object.
		boolean res2=str3.equals(str4);	   //equals() method of object overrided by String class compares the values of two object.
		boolean res3=str1==str2;		//object is created in heap area of memory hence both str1&str2 will have different refrence
		boolean res4=str3==str4;		//object is created in heap area of memory hence both str3&str4 will have different refrence	

		System.out.println(res1);		//false
		System.out.println(res2);		//true
		System.out.println(res3);		//false
		System.out.println(res4);		//false
	}

}
