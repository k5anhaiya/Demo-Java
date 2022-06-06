import java.util.*;
public class App 
{
	public static void main(String[] args) 
	{
		LinkedList<Integer> al1=new LinkedList<Integer>();
		
		LinkedList<Integer> al2=new LinkedList<Integer>(List.of(10,20,30));
		
		System.out.println(al1);
		
		System.out.println(al2);
		al1.add(20);
		al1.add(30);
		al1.add(40);
		al1.add(50);

	}

}
