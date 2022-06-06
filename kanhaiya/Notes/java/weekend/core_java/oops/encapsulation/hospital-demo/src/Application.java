
public class Application 
{

	public static void main(String[] args) 
	{
		//code to store detail of each patient
	patient obj1=new patient("Kanhaiya","kumar",56.25,21.55,22);
	//on execution of above code 5 variables will be created and above values will be assigned.
	//above code is written to create object
	patient obj2=new patient("Manish","kumar",56.25,20.56,28);
	patient obj3=new patient("Raja","kumar",24.56,24.36,26);
	patient obj4=new patient("Roshni","kumar",28.56,29.56,24);
	
	
	//code to display details of each patient
	obj1.showDetails();
	obj2.showDetails();
	obj3.showDetails();
	obj4.showDetails();
	
	
	}

}
