import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.ArrayList;

public class ChatThread extends Thread
{
	private Socket soc;
	private ArrayList<Socket> list;
	public ChatThread(Socket sc,ArrayList<Socket> al)
	{
		soc=sc;
		list=al;
	}
	public void run()
	{
		while(true)
		{
			try 
			{
				//code to read message from client socket
				DataInputStream dis=new DataInputStream(soc.getInputStream());
				String message=dis.readUTF();
				//code to write mesage to all socket
				for(Socket ss:list)
				{
					DataOutputStream dos=new DataOutputStream(ss.getOutputStream());
					dos.writeUTF(message);
				}
			} 
			catch (Exception e) 
			{
				System.out.println(e);
			}
		}
	}

}
