import java.util.HashSet;
import java.util.*;

public class hashsetpractise1 
{
	public static void main(String[] args) 
	{
		HashSet<Integer> evenNumber=new HashSet<Integer>();//by defualt capacity will be 16 and load factor will be 0.75 i.e 75%
		// Using add() method
        evenNumber.add(2);
        evenNumber.add(4);
        evenNumber.add(6);
        evenNumber.add(null);
        System.out.println("HashSet: " + evenNumber);

        HashSet<Integer> numbers = new HashSet<>();
        
        // Using addAll() method
        numbers.addAll(evenNumber);
        numbers.add(5);
        System.out.println("New HashSet: " + numbers);
	}

}
