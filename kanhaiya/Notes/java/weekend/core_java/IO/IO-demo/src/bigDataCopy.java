import java.io.*;

import javax.swing.event.TreeWillExpandListener;

public class bigDataCopy 
{
	public static void main(String[] args) 
	{
		try 
		{
			long starttime=System.currentTimeMillis(); //it will calculate time in milliseconds
			System.out.println("Copy Started....");
			FileInputStream fis=new FileInputStream("D:\\java\\weekend\\core_java\\IO\\self\\data.txt");
			DataInputStream dis=new DataInputStream(fis);
			FileOutputStream fos=new FileOutputStream("D:\\java\\weekend\\core_java\\IO\\self\\mydata.txt");
			PrintStream ps=new PrintStream(fos);
			String str=dis.readLine();
			
			while(str!=null)
			{
				ps.println(str);
				str=dis.readLine();
			}
			System.out.println("Copy Completed....");
			long endtime=System.currentTimeMillis();//it will calculate time in milliseconds
			long time=endtime-starttime;
			System.out.println("Total time taken="+(double)(time)/1000 +" seconds");
		} 
		catch (Exception ex) 
		{
			System.out.println(ex);
		}
	}

}
