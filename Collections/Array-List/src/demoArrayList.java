
import java.util.*;


public class demoArrayList 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> type1=new ArrayList<>(20);
		ArrayList<Integer> type3=new ArrayList<>();
		
		ArrayList<Integer> type2=new ArrayList<>(Arrays.asList(1000,20,30,40,50,60,70,80,90,100));
		
		type2.add(25); //to add element in the arraylist
		type2.add(3,70);
		type1.add(10);	//to add element in the arraylist
		type1.add(0,5);	//to add element in the arraylist
		System.out.println(type1);   //to print the element in type1 array
		System.out.println(type2);	//to print the element in type2 array
		System.out.println(type3);  //to print the element in type3 array
		type1.addAll(type2);  		//to add all the values of type1 to type2
		System.out.println(type1);  //to check the new assigned values
		type1.addAll(1,type2);      //to add the values with index
		System.out.println(type1);	//here it is showing output because it is already added
									//in above steps
		//type1.clear();		//to clear the complete list
		//System.out.println(type1);
		//type1.clone();			//this will make clone duplicate of the type1
		//System.out.println(type1);
		System.out.println(type2.contains(50));  //to check whether the list contains the value 50 or not
							//if yes returns true else false
		System.out.println(type2.contains(500));
		System.out.println(type1.equals(type2));  //to check whether the list elements are equal or not.
		System.out.println(type1.get(5));	//to check the value at some index
		System.out.println(type1.indexOf(60));  //this will return the index of element 70 from the begning
		System.out.println(type2.lastIndexOf(1000));//this will return the last index of 1000 from the list
		System.out.println(type2.indexOf(70));
		System.out.println(type2.lastIndexOf(70));
		type2.remove(5);  //to remove the element from the index
		type2.set(0, 21);   //to set the value at any index by removing that value
		System.out.println(type2);
		//to iterate or scan to visit all the elements 
		for(int i=0;i<type2.size();i++)
		{
			//System.out.println(type2[i]); //here we are getting error because this is generic we cannot use this
			System.out.print(type2.get(i)+" ");
		}
		// we can also use this method to iterate every element in the list.
//		for(int x:type2)
//		{
//			System.out.println(type2.get(x));
//		}
		//we can use iterator also to access the all the elements of type2
//		Iterator<Integer> it=type2.iterator();
//		while(it.hasNext())
//		{
//			System.out.print(it.next()+",");
//		}
//		
//		ListIterator<Integer> it1=type2.listIterator(); //it is used to go bidirectional
//		while(it1.hasNext())            //it has more methods than iterator
//		{
//			System.out.print(it1.next()+",");
//		}
		//we can also use for loop here
//		for(ListIterator<Integer> it2=type2.listIterator();it2.hasNext();)
//		{
//			System.out.print(it2.next()+",");
//		}
	
	}

}
