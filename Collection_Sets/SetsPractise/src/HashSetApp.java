import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class HashSetApp 
{
	public static void main(String[] args) 
	{
		HashSet<Integer> hs1=new HashSet<Integer>();
		LinkedHashSet<Integer> lhs1=new LinkedHashSet<Integer>();
		
		hs1.add(null);
		hs1.add(2);
		hs1.add(2);
		hs1.add(2);
		hs1.add(2);  //  Hashset and LinkedHashSet allows only one null
		hs1.add(2);
		hs1.add(null);
		hs1.add(4);
		hs1.add(44);
		lhs1.add(null);
		lhs1.add(45);
		lhs1.add(45);
		lhs1.add(45);
		lhs1.add(45);
		lhs1.add(45);
		lhs1.add(45);
		lhs1.add(45);
		lhs1.add(null);
		System.out.println(hs1);
		System.out.println(lhs1);
		
		
		
	}

}
