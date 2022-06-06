
public class Task implements Runnable 
{
	public void run() 
	{
		System.out.println("Run method is called....");
		for(int i=1;i<=50;i++)
		{
			System.out.print(i+",");
		}
		System.out.println();
	}

}
