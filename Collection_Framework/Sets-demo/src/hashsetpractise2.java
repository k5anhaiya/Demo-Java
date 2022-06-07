import java.util.HashSet;
import java.util.*;

public class hashsetpractise2 
{
	public static void main(String[] args) 
	{
		HashSet<Integer> set1=new HashSet<Integer>();//bydefault capacity 16 and loadfactor 0.75
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5);
		set1.add(6);
		set1.add(7);
		set1.add(8);
		set1.add(9);
		set1.add(10);
		set1.add(11);
		set1.add(12);
		set1.add(13);
		set1.add(14);
		set1.add(15);
		set1.add(16);
		set1.add(17);
		set1.add(18);
		System.out.println(set1);
		
		//calling iterator method
		Iterator<Integer> it1=set1.iterator();
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}
	}

}
