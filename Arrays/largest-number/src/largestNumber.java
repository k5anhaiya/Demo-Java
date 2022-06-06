import java.util.Scanner;

public class largestNumber 
{
	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.print("please enter the size of the array :");
		int size=sc.nextInt();
		int [] arr=new int [size];
		System.out.println("please enter "+size+" Numbers :");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		int temp=0;
		for(int j=0;j<arr.length;j++)
		{
			for(int k=j+1;k<arr.length;k++)
			{
				if(arr[j]<arr[k])
				{
					temp=arr[j];
					arr[j]=arr[k];
					arr[k]=temp;
				}
			}
		}
		for(int ctr:arr)
		{
			System.out.print(ctr+" ");
		}

	}

}
