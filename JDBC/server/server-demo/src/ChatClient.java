import java.io.DataInputStream;
import java.net.Socket;

public class ChatClient
{
	private Socket soc;
	public ChatClient()
	{
		try 
		{
			soc=new Socket("localhost",2001);
			
		} 
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
	class ReadMessageThread extends Thread
	{
		public void run()
		{
			try 
			{
				DataInputStream dis=new DataInputStream(soc.getInputStream());
				while(true)
				{
					String message=dis.readUTF();
					System.out.println(message);
				}
			} 
			catch (Exception e) 
			{
			System.out.println(e);
			}
		}
		
	}
	public static void main(String[] args) 
	{
		new ChatClient();
		
	}

}
