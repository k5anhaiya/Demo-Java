import java.io.FileOutputStream;
import java.io.PrintStream;

public class output
{
	public static void main(String[] args) 
	{
		try 
		{
			FileOutputStream fos=new FileOutputStream("D:\\Eclipseprojects\\Demo-Java\\aa.txt");
			PrintStream ps=new PrintStream(fos);
			ps.println("This is the first line of output");
			ps.println("This is the second line of output");
			ps.println("This is the third line of output");
			ps.println("This is the fourth line of output");
			ps.println("This is the fifth line of output");
			ps.println("kanhaiya kumar");
		} 
		catch (Exception e) 
		{
			System.out.println(e);
		}

	}

}
