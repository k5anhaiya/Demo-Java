import java.util.Scanner;

public class email_Validation 
{
	public static boolean isValid(String email)
	{
		int v1=email.indexOf('@');
		int v2=email.indexOf('.');
		if(v1==-1)
			return false;
		if(v2==-1)
			return false;
		if(v1>v2)
			return false;
		return true;
	}
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Please enter Email :");
		String email=scanner.nextLine();
	boolean st=isValid(email);
	System.out.println(st);	

	}

}
