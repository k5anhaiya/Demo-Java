import java.util.Scanner;
public class logicalor 
{public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your Age=");
	int age=sc.nextInt();
	if(age<20 || age>30) // use of logical operator "(or)"
	{
		System.out.println("invalid user");
		}
	else
		{                                                 //for logical operator or
		System.out.println("valid user");                  // comdition1      condition2     pass  
		}                                                   //  True            True           True
	}                                                       //  True            False          True
}                                                           //  False           True           True 
                                                            //  False           False          False    