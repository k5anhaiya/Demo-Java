import java.util.LinkedHashMap;
import java.util.Map;

public class example2 
{
	public static void main(String[] args) 
	{
		LinkedHashMap<Integer, String> lhm=new LinkedHashMap<Integer, String>(5,0.75f,true); //if we pass true it will show in order of their access order.
		//if we will not pass anything true then it will show in ascending insertion order.
		lhm.put(1, "A");
		lhm.put(2, "B");
		lhm.put(3, "C");
		lhm.put(4, "D");
		lhm.put(5, "E");
		String s=lhm.get(2);
		s=lhm.get(5);
		s=lhm.get(1);
		lhm.put(6, "F");
		lhm.forEach((k,v)->System.out.println(k+" "+v));
	}

}
