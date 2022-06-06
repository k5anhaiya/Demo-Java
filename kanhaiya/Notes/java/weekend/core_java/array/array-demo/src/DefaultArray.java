import java.util.Scanner;

public class DefaultArray 
{
	public static void main(String[] args) 
	{
	int [] num=new int[3];
	String []a=new String[3];
	Scanner []sc=new Scanner[3];
	for(int i=0;i<num.length;i++)
	{
	System.out.println(num[i]);	// this will print the default value of array.
	System.out.println(a[i]);	
	System.out.println(sc[i]);
	}
	}
}
/*default values for different data types:
 int type=0
 String type=null
 float type=0.0
 boolean type=false
 if type is class=null        */