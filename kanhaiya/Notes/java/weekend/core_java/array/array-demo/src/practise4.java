public class practise4 
{

	public static void main(String[] args) 
	{
	int [] x= {10,20,30,40,50};
	//copy value of this array into a new array y in reverse order.
	int [] y=new int[x.length];
	/*y[0]=x[4];
	y[1]=x[3];
	y[2]=x[2];
	y[3]=x[1];
	y[4]=x[0];*/
	//above code will can be solved using for loop also.
	int z=y.length-1;
	for(int i=0;i<y.length;i++,z--)
	{
	y[i]=x[z];	
	}
	System.out.println("value of array x:");
	for(int i=0;i<x.length;i++)
	{
		System.out.print(x[i]+" ");
	}
	System.out.println();
	System.out.println("value of array y:");
	for(int i=0;i<x.length;i++)
	{
		System.out.print(y[i]+" ");
	}
	}

}
