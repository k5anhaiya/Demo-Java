
public class numberThread extends Thread 
{
	public void run()
	{
		for(int num=10;num>=1;num--)
		{
			System.out.println(num);
			try 
			{
			Thread.sleep(1000); //1000millisecond=1second
			}
			catch(InterruptedException ex)
			{
				System.out.println(ex);
			}
		}
	}
}