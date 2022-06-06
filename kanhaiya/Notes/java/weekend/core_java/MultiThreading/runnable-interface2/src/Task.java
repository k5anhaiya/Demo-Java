
public class Task extends Thread 
{
	public void run() 
	{
		System.out.println("This is example of Thread.");
		for(int i=1;i<=40;i++)
		{
			System.out.print(i+",");
		}
		System.out.println();
	}

}
