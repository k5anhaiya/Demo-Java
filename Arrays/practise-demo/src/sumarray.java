
public class sumarray 
{
	public static void main(String[] args) 
	{
		int [] arr= {235,235,23,65,48,6,56,45,8,121,512};
		int temp;
		int sum=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			sum=arr[i]+sum;
		}
		System.out.println("Answer of sum :"+sum);

	}

}
