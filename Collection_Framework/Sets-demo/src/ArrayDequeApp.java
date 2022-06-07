import java.util.ArrayDeque;
import java.util.*;

public class ArrayDequeApp 
{
	public static void main(String[] args) 
	{
		ArrayDeque<Integer> ad1=new ArrayDeque<Integer>();
		ad1.add(23);
		ad1.add(24);
		ad1.offerLast(34);
		ad1.offerLast(56);
		ad1.offerLast(45);
		ad1.offerLast(30);
		ad1.offerFirst(22);
		ad1.offerFirst(45);
		ad1.offerFirst(56);
		System.out.println(ad1);
		
	}

}
