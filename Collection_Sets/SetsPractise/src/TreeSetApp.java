import java.util.TreeSet;
import java.util.*;

public class TreeSetApp 
{
	public static void main(String[] args) 
	{
//		TreeSet<Integer> set1=new TreeSet<Integer>();
//		TreeSet<Integer> set2=new TreeSet<Integer>();
//		set1.add(45);
//		set1.add(56);
//		set1.add(7439);
//		set1.add(4375);
//	
//		set2.add(678);
//		set2.add(329846);
//		set1.add(983247);
//		set2.add(984327);
//		
//		
//		//calling iterator to print the elements of set1
//		Iterator<Integer> it1=set1.iterator();
//		while(it1.hasNext())
//		{
//			System.out.println(it1.next());
//		}
//		//calling iterator to print the elements of set2
//		Iterator<Integer> it2=set2.iterator();
//		while(it2.hasNext())
//		{
//			System.out.println(it2.next());
//		}
//		
//		//Method of TreeSet
//		TreeSet<Integer> numbers = new TreeSet<>();
//        numbers.add(2);
//        numbers.add(5);
//        numbers.add(4);
//        numbers.add(6);
//      System.out.println("TreeSet: " + numbers);
//
//      // Using higher()
//        System.out.println("Using higher: " + numbers.higher(4));
//
//        // Using lower()
//        System.out.println("Using lower: " + numbers.lower(4));
//
//        // Using ceiling()
//        System.out.println("Using ceiling: " + numbers.ceiling(4));
//
//        // Using floor()
//        System.out.println("Using floor: " + numbers.floor(3));
        
        TreeSet<Integer> numbers1 = new TreeSet<>();
        numbers1.add(2);
        numbers1.add(5);
        numbers1.add(4);
        numbers1.add(6);
//        System.out.println("TreeSet: " + numbers1);
//
//        // Using pollFirst()
//        System.out.println("Removed First Element: " + numbers1.pollFirst());
//
//        // Using pollLast()
//        System.out.println("Removed Last Element: " + numbers1.pollLast());
//
//        System.out.println("New TreeSet: " + numbers1);
        System.out.println(numbers1.headSet(4));


	}

}
