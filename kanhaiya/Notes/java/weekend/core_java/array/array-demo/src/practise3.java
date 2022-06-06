/*find the sum of all of the index of an array*/
public class practise3 
{
	public static void main(String[] args) 
	{
	int [] a= {10,20,30,40,50};
	int sum=a[0];
	for(int i=1;i<a.length;i++)
	{
		 sum=sum+a[i];
	}
	System.out.println(sum);
	}

}
