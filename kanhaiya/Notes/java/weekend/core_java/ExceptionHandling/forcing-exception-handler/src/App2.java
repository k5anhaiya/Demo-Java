import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.FileAlreadyExistsException;

public class App2 
{
	public static void main(String[] args) 
	{
		FileReader fr=new FileReader("aa.txt"); //this is checked exception hence showing error
		int num1=90;
		int num2=0;
		//this code might create exception but not showing error because this is unchecked exception.
		int res=num1/num2;
		
	}

}
