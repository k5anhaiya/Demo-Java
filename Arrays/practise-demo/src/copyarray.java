
public class copyarray 
{
	public static void main(String[] args) 
	{
		long starttime=System.currentTimeMillis();
		System.out.println("Execution Begins.....");
		int [] arr= {10,20,30,40,50};
		int [] ar1=new int[5];
		for(int i=0;i<arr.length;i++)
		{
			ar1[i]=arr[i];
		}
		System.out.println("valued copied successfully");
		for(int z:ar1)
		{
			System.out.println(z);
		}
		long endtime=System.currentTimeMillis();
		long exacttime=endtime-starttime;
		System.out.println("Execution Ends.....");
		System.out.println("Total timetaken :"+exacttime/1000+" seconds");
		
		

	}

}
