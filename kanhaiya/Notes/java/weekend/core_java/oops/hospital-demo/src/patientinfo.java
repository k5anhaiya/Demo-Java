//write a programme to show the details of 1 patient.
import java.util.Scanner;

public class patientinfo 
{
	public static void main(String[] args) 
	{
		String firstname;
		String lastname;
		double weight;
		double height;
		int age;
		Scanner obj=new Scanner(System.in);
		System.out.print("Enter the first name:");
		firstname=obj.nextLine();
		System.out.print("Enter the last name:");
		lastname=obj.nextLine();
		System.out.print("Enter Weight:");
		weight=obj.nextDouble();
		System.out.print("Enter Height:");
		height=obj.nextDouble();
		System.out.print("Enter Age:");
		age=obj.nextInt();
		System.out.println(".............Patient Details................");
		System.out.println("first name is:"+firstname);
		System.out.println("Last name is:"+lastname);
		System.out.println("weight is:"+weight);
		System.out.println("height is:"+height);
		System.out.println("age is:"+age);
	}

}
