import java.io.*;

import javax.swing.event.TreeWillExpandListener;

public class ReadApp 
{
	public static void main(String[] args) 
	{
		try 
		{
			FileInputStream fis=new FileInputStream("D:\\java\\weekend\\core_java\\IO\\self\\aa.txt");
			//to read the things in the file we will use datainputstream method
			DataInputStream dis=new DataInputStream(fis);
			String str=dis.readLine();//this will return the text in the first line
			//after executing returns null at end
			//hence we will put this in loop
			while(str!=null)
			{
			System.out.println(str);
			str=dis.readLine();
			}
		} 
		catch (Exception ex) 
		{
			System.out.println(ex);
		}
	}

}