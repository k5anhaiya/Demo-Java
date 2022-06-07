import java.util.LinkedHashSet;
import java.util.ArrayList;

public class lhs1 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> evenNumbers=new ArrayList<Integer>();
		evenNumbers.add(2);
		evenNumbers.add(4);
		System.out.println("ArrayLisy:" +evenNumbers);
		
		//creating a LinkedHashSet from a ArrayList
		LinkedHashSet<Integer> numbers=new LinkedHashSet<Integer>(evenNumbers);
		System.out.println("LinkedHashSet "+numbers);
		
	}

}
