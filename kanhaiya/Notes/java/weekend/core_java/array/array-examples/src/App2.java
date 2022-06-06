public class App2
{
	public static void main(String[] args) 
	{
		int [] num= {10,20,30,40,50,60,70};
		/*normal printing of array*/
		for(int i=0;i<num.length;i++)
			System.out.print(num[i]+",");
			System.out.println();
		//print the array in reverse order
		for(int i=num.length-1;i>=0;i--)
		{
			System.out.print(num[i]+",");
		}
	}
}