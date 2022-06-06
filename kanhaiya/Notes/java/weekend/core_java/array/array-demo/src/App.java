public class App
{
	public static void main(String[] args) 
	{
		//array declaration  syntax: datatype [] variablename
		int []x,num;  //here x and num are both arrays
		/*we can declare above code as int [] x=new int[3]*/
		int y [],z;    //y is array but z is int type variable.
		x=new int[3];
		num=new int[2];
		x[0]=10;
		x[1]=20;
		x[2]=30;
		for(int i=0;i<x.length;i++)
		{
			System.out.println(x[i]);
		}
		num[0]=500;
		num[1]=575;
		for(int i=0;i<num.length;i++)
		{
			System.out.println(num[i]);
		}
	}
}