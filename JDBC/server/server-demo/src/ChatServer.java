import java.net.*;
import java.util.ArrayList;
public class ChatServer 
{
	private ServerSocket server;//here ServerSocket is the class & server is refrence variable
	private ArrayList<Socket> list=new ArrayList<Socket>();
	public ChatServer()
	{
		try 
		{
			server=new ServerSocket(2001);
			System.out.println("Server Started....");
			while(true)
			{
				Socket soc=server.accept();
				System.out.println("Client request accepted...");
				list.add(soc);
				ChatThread th=new ChatThread(soc, list);
				th.start();
				
			}
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
	public static void main(String[] args) 
	{
	new ChatServer();	
	}
}
