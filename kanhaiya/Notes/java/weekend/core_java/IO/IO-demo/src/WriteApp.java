import java.io.*;

public class WriteApp 
{
	public static void main(String[] args) 
	{
		try 
		{
			FileOutputStream fos=new FileOutputStream("D:\\java\\weekend\\core_java\\IO\\self\\aa.txt");
			//pass the url of the folder in which you want
			//to write the code
			//now we want to write the code in the file
			//we will create object of printstream
			PrintStream ps=new PrintStream(fos);
			ps.println("Welcome to the CETPA Infotech");
			ps.println("Hello Everyone");
			ps.print("Noida");
			ps.println("This is an Example of IO");
			ps.println("Delhi");
		} 
		catch (Exception ex) 
		{
			System.out.println(ex);
		}
	}

}
