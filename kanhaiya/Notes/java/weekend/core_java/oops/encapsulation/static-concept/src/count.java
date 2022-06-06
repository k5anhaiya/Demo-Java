
public class count 
{
	int count1=0;
	public count()    
	{
		count1++;
		System.out.println(count1);
		
	}
public static void main(String[] args) 
	{
		count obj=new count(); //each time it is calling the instance variable from the begning.
		count obj1=new count(); //each time it is calling the instance variable from the begning.
		count obj2=new count(); //each time it is calling the instance variable from the begning.
		count obj3=new count(); //each time it is calling the instance variable from the begning.
	}
}
