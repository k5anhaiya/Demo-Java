import java.io.*;

import javax.swing.event.TreeWillExpandListener;

public class copyApp 
{
	public static void main(String[] args) 
	{
		try 
		{
			FileInputStream fis=new FileInputStream("D:\\java\\weekend\\core_java\\IO\\self\\aa.txt");
			DataInputStream dis=new DataInputStream(fis);
			FileOutputStream fos=new FileOutputStream("D:\\java\\weekend\\core_java\\IO\\self\\bb.txt");
			PrintStream ps=new PrintStream(fos);
			String str=dis.readLine();
			
			while(str!=null)
			{
				ps.println(str);
				str=dis.readLine();
			}
		} 
		catch (Exception ex) 
		{
			System.out.println(ex);
		}
	}

}