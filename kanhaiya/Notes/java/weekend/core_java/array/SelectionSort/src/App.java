public class App 
{

	public static void main(String[] args) 
	{
		int [] num= {29,21,17,14,16,5,4,8};
		int n=num.length;
		for(int i=0;i<n-1;i++)
		{
			int si=i;
			for(int j=i+1;j<n;j++)   // to find index of smallest number
			{
				if (num[j]<num[si])
				{
					si=j;
				}
				// code to swap the smallest number with the first number of array
				int temp=num[si];
				num[si]=num[i];
				num[i]=temp;
			}
			//code to display array numbers
			
		}
		for(int x:num)
		{
			System.out.println(x);
		}

	
	}

}
