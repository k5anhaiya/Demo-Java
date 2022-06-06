import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.FileAlreadyExistsException;

public class App 
{
	public static void main(String[] args) 
	{
		try 
		{
			FileReader fr=new FileReader("aa.txt");
		} catch (FileNotFoundException ex) 
		{
			System.out.println(ex);
		}
		
	}

}
