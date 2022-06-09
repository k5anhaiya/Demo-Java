import java.util.HashMap;
import java.util.Map;

public class mapDemo
{
	public static void main(String[] args) 
	{
		//Creating a map using the HashMap
		Map<String,Integer> numbers=new HashMap<>();
		//Inserts elements to the map
		numbers.put("one", 1);
		numbers.put("two", 2);
		System.out.println("Map: "+numbers);
		
		//Access values of the map
		System.out.println("Values: "+numbers.values());
		
		//Access keys of the map
		System.out.println("Keys: "+numbers.keySet());
		
		//Access entries of the map
		System.out.println("Entries: "+numbers.entrySet());
		
		//Remove elements from the map
		numbers.remove("two");
		System.out.println("Removed Values: "+ numbers);
	}

}
