import java.util.TreeMap;
import java.util.Map;

public class Exmaple2 
{
	public static void main(String[] args) 
	{
		//creating Map using TreeMap
		Map<String,Integer> values=new TreeMap<>();
		//inserting elements in the map
		values.put("Second",2);
		values.put("First", 1);
		System.out.println("Map using TreeMap:"+ values);
		
		//Replacing the values
		values.replace("First", 11);
		values.replace("Second", 22);
		System.out.println("Replaced values: "+values);
		
		//Remove elements from the map
		values.remove("First");
		System.out.println("Values after remove: "+values);

	}

}
