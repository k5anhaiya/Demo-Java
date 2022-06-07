import java.util.HashSet;
import java.util.*;
public class unionset 
{
	public static void main(String[] args) 
	{
		HashSet<Integer> set1=new HashSet<Integer>();
		HashSet<Integer> set2=new HashSet<Integer>();
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
		//we are doing union of two sets
		set2.addAll(set1);
		set2.add(10);
		set2.add(786);
		set2.add(12);
		System.out.println("SET 1 :"+set1);
		System.out.println("SET 2 :"+set2);
		
		//intersections of sets
		set2.retainAll(set1);//this will delete all other elements except commons in both
		System.out.println(set2);
		
		//Difference of sets
//		set1.removeAll(set2);
//		System.out.println(set1);
		
		//subset of sets
//		boolean answer= set1.containsAll(set2);
//		System.out.println("Answer of subset="+answer);
//		//subset of sets
//		 answer= set2.containsAll(set1);
//		System.out.println("Answer of subset="+answer);
	


	}

}
