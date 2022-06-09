
import java.util.Properties;

public class HashTableDemo
{
	public static void main(String[] args) 
	{
		Properties p=new Properties();
		p.setProperty("Brand", "Dell");
		p.setProperty("Processor", "i7");
		p.setProperty("OS", "Windows10");
		p.setProperty("Model", "Latitiude");
		p.store("D:\\self-work\\git office\\Core-Java\\aa.txt","Laptop");
		

	}

}
