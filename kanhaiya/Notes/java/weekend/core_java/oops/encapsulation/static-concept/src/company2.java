
public class company2 
{
	int empid;    //this is variable declaration
	String name;
	static String company="King of Punjab";
	
	public company2(int empid,String name)      //this is constructor
	{
		this.empid=empid;      //this is used to pick the variable at class level
		this.name=name;
	}
	public void display()
	{
		System.out.println(empid+" "+name+" "+company);
	}
	public static void main(String[] args) 
	{
		company2 obj=new company2(101,"kanhaiya");
		obj.display();
		company2 obj1=new company2(102,"Manish");
		obj1.display();
		company2 obj2=new company2(103,"Raja");
		obj2.display();
	}
}


//static variable will share the memory with all the variables at class level.
//static varibale is defined at class level.
