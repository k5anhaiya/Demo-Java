import java.util.Scanner;

public class SearchName2 
{
	public static void main(String[] args) 
	{
		String [] list= {"shobit","mohan","kanhaiya","Mukesh","raajesh","rakesh","rajesh","munna","sohan","Munna"};
		System.out.println("Please Enter Name Of Your Choice:");
		Scanner sc= new Scanner(System.in);
		String x=sc.nextLine();
		boolean found=false;
		for(String str:list)
		{
			if(str.equalsIgnoreCase(x))  //str.equalsIgnoreCase is used to ignore the upper case letters.
			{
			found=true;
			System.out.println(x+" Found in the list");	
			break;
			}
		}
		if(!found)
			System.out.println("Name is not in the list");
	}

}
