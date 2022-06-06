
public class practice1 
{
	public static void main(String[] args) 
	{
		/*there are two ways to initialize value to an array*/
		int [] a= {56,55,54,200,100,10,25,50,60};  //1st way to initialize value to an array.here size 
		//of the array is not fixed.
		int []x=new int[] {10,20,30,40,50};        //2nd way to initialize value to an array.here size 
		//of the array is not fixed.
		int [] y=new int[6];               //array size is declared.
		//now initialzing value to array y.
		y[0]=15;
		y[1]=20;
		y[2]=25;
		y[3]=30;
		y[4]=35;
		y[5]=40;
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+",");
		}
		System.out.println();
		System.out.println("--------------------------------");
		for(int i=0;i<x.length;i++)
		{
			System.out.print(x[i]+",");
		}
		System.out.println();
		System.out.println("--------------------------------");
		for(int i=0;i<y.length;i++)
		{
			System.out.print(y[i]+",");
		}
	}
}
