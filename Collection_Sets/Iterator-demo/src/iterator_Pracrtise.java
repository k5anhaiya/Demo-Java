import java.util.ArrayList;
import java.util.Iterator;

public class iterator_Pracrtise
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> numbers=new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(3);
		numbers.add(2);
//		System.out.println("ArrayList: "+numbers);
//		
//		//creating an instance of iterator
		Iterator<Integer> iterate=numbers.iterator();
//		
		//using the next() method
//		int number=iterate.next();
//		System.out.println("Accessed Element: "+number);
//		
		//using the remove() method
//		iterate.remove();
//		System.out.println("Removed Element:" +number);
//		
//		System.out.println("Updated ArrayList: ");
//		
		//Using the hasNext() method
		while(iterate.hasNext())
		{
			//using the next forEachRemaning Method
			iterate.forEachRemaining((value) -> System.out.print(value + ","));
		}
		

	}

}
