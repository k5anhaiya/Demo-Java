/*write a programme to declare an array of size 5, print it,also do the reverse print*/

public class practise2 
{
	public static void main(String[] args) 
	{
	int [] x=new int[5];  //array declaration & size of array is declared.
	x[0]=10;
	x[1]=20;
	x[2]=30;
	x[3]=40;
	x[4]=50;
	for (int i=0;i<x.length;i++)   //print of array
	{
		System.out.println(x[i]);
	}
	for (int i=x.length-1;i>=0;i--)   //print of array in reverse order
	{
		
		System.out.println(x[i]);	
	}
	}
}
