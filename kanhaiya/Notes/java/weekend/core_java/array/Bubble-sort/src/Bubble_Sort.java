
public class Bubble_Sort 
{
	public static void main(String[] args) 
	{
		int [] num= {12,15,16,25,50,1,5,49,56,1};
		int n=num.length;
		//loop for round
		for(int i=1;i<n;i++)
		{
			//loop for round wise swapping
			for(int j=0;j<n-i;j++)
			{
				if(num[j]>num[j+1])
				{
					int temp=num[j];
					num[j]=num[j+1];
					num[j+1]=temp;
				}
			}
		}
		for(int x:num)
		{
			System.out.println(x);
		}
	}

}
