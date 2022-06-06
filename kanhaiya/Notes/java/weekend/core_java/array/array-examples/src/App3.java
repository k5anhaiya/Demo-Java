/*find the sum of array*/
public class App3
{
	public static void main(String[] args) 
	{
		
		int [] num= {10,20,30,40,50};
		int sum=num[0];
		//print the sum of all index of an array
		for(int i=1;i<num.length;i++)
		{
			sum=sum+num[i];
		}
		System.out.println(sum);
		
	}
}