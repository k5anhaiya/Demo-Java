
public class count2 
{
	static int count1=0;  //static varibale will share its memory with all varibales at class level.
	public count2()
	{
		count1++;
		System.out.println(count1);
		
	}
public static void main(String[] args) 
	{
		count2 obj=new count2(); //each time it is calling the new recorded value of instance variable.
		count2 obj1=new count2(); //each time it is calling the new recorded value of instance variable.
		count2 obj2=new count2(); //each time it is calling the new recorded value of instance variable.
		count2 obj3=new count2(); //each time it is calling the new recorded value of instance variable.
	}
}
