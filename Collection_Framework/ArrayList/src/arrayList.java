import java.util.ArrayList;
import java.util.*;

public class arrayList 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> al1=new ArrayList<Integer>(5);
		al1.add(45);
		al1.add(55);
		al1.add(65);
		
		al1.add(75);
		al1.add(85);
		al1.add(95);
		al1.add(204);
		al1.add(305);
		al1.add(234);
		ArrayList<Integer> al2=new ArrayList<Integer>();
		al2.addAll(al1);
		al2.add(542);
		al2.add(954);
		al2.remove(5);
		//al1.clear();
//		System.out.println(al1.isEmpty());
//		System.out.println(al1.containsAll(al2));
//		System.out.println(al2.containsAll(al1));
		//System.out.println(al1.equals(al2));
//		System.out.println(al1.size());
//		Iterator<Integer> it1=al1.iterator();
//		while(it1.hasNext())
//		{
//			System.out.print(it1.next()+" ");
//		}
//		for(Iterator<Integer> it2=al2.iterator();it2.hasNext();)
//		{
//			System.out.print(it2.next()+" ");
//		}
		System.out.println(al1.toArray());
		System.out.println(al2.toArray());
		
//		al2.removeAll(al1);
		//System.out.println(al2.retainAll(al1));
		System.out.println(al1);
//		System.out.println(al2);
		
	}

}
