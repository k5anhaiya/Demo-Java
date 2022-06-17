import java.util.Scanner;

public class app2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("please enter the size of array :");
		int size=sc.nextInt();
		int [] arr=new int[size];
		System.out.println("please enter the elements of array :");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();					
		}
		int sum=arr[0];
		for(int ctr=1;ctr<arr.length;ctr++)
		{
			sum=sum+arr[ctr];
		}
		System.out.println("Total sum of numbers : "+sum);
	}
	


}
