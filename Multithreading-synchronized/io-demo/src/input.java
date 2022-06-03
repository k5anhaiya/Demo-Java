import java.io.*;

public class input 
{
	public static void main(String[] args) 
	{
		try 
		{
			FileInputStream fis=new FileInputStream("D:\\\\Eclipseprojects\\\\Demo-Java\\\\aa.txt");
			DataInputStream dis=new DataInputStream(fis);
			String str=dis.readLine();
			while(str!=null)
			{
				str=dis.readLine();
				System.out.println(str);
			}
		} 
		catch (Exception e) 
		{
			System.out.println(e);
		}
		
	}

}
