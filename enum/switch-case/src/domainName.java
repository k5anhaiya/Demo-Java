import java.util.Scanner;

public class domainName
{
	public static void main(String[] args) 
	{
		System.out.println("Please enter Domain name:");
		Scanner scanner=new Scanner(System.in);
		String domain;
		domain=scanner.nextLine();
		String ext=domain.substring(domain.lastIndexOf(".")+1);
		
		switch (ext)
		{
		case "com":
			System.out.println("google.com");
			break;
		case "net":
			System.out.println("google.net");
			break;
		case "org":
			System.out.println("google.org");
			break;

		}
	}

}
