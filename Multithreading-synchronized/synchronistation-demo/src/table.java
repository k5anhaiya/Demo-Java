
public class table
{
	int totalseats=100;
	public table()
	{
		bookSeatsThread th1=new bookSeatsThread();
		th1.start();
	}
	
	public void bookSeats()
	{
		
		{
			for(int i=0;i<=10;i++)
			{
			int z=i*i;
			System.out.print(z+" ");
			}
		}
	}
	class bookSeatsThread extends Thread
	{
		public void run()
		{
			while(true)
			{
			try 
				{
				Thread.sleep(10);
				bookSeats();
				} 
			catch (Exception e) 
				{
				System.out.println(e);
				}
			}
			
		}
	}

	public static void main(String[] args) 
	{
		table t1=new table();
	}
}
