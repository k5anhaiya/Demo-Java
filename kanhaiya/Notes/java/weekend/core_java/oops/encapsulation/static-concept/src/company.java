
public class company 
{
	int empid;    //this is variable declaration
	String name;
	String company;
	
	public company(int empid,String name,String company)      //this is constructor
	{
		this.empid=empid;
		this.name=name;
		this.company=company;
	}
	public void display()
	{
		System.out.println(empid+" "+name+" "+company);
	}
	public static void main(String[] args) 
	{
		company obj=new company(101,"kanhaiya","Maintec Technology");
		obj.display();
		company obj1=new company(102,"Manish","Maintec Technology");
		obj1.display();
		company obj2=new company(103,"Raja","Maintec Technology");
		obj2.display();
	}
}


//hence we found that memory allocation for same company will be done alot of times, as the number of 
//object is created.it will use more memory hence we use static variable so that it may be declared at
//class level.