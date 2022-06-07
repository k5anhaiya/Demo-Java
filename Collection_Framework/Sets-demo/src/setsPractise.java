import java.util.HashSet;

public class setsPractise 
{
	public static void main(String[] args) 
	{
		//creating a set using HashSet class
		HashSet<Integer> set1=new HashSet<Integer>();
		//adding element to the set
		set1.add(5);
		set1.add(6);
		set1.add(7);
		System.out.println("set 1: "+set1);
		
		//creating another set using HashSet Class
		HashSet<Integer> set2=new HashSet<Integer>();
		//addding element to the set
		set2.add(6);
		set2.add(8);
		set2.add(9);
		set2.add(10);
		set2.add(11);
		set2.add(12);
		System.out.println("Set 2: "+set2);
	}

}
