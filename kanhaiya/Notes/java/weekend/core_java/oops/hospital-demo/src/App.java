
public class App 
{

	public static void main(String[] args) 
	{
		
	//code to store details of each patient
	patient p1=new patient("Amit","singh",56.2,65.23,54);
	patient p2=new patient("kanhaiya","kumar",55.2,20.3,24);
	patient p3=new patient("Anmol","pandey",23.2,5.02,56);
	patient p4=new patient("preeti","singh",74.2,56.23,20);
	
	
	//code to display details of each patient
	p1.showDetails();
	p2.showDetails();
	p3.showDetails();
	p4.showDetails();
	}

}
