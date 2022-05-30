

public class patient_info 
{
	String firstname;
	String lastname;
	int age;
	int weight;
	float height;
	
	public  patient_info(String fn,String ln,int ag,int we,float he)
	{
		this.firstname=fn;
		this.lastname=ln;
		this.age=ag;
		this.weight=we;
		this.height=he;
	}
	public void displayDetails()
	{
		System.out.println("firstname="+firstname);
		System.out.println("lastname="+lastname);
		System.out.println("age="+age);
		System.out.println("weight="+weight);
		System.out.println("Height="+height);
		System.out.println("---------------------------");
	}

	public static void main(String[] args) 
	{
		patient_info p1=new patient_info("Kanhiaya","Kumar",75,24,172);
		patient_info p2=new patient_info("Arvind","Kumar",60,42,160);
		patient_info p3=new patient_info("puja","Kumari",45,24,120);
		patient_info p4=new patient_info("Rinku","Kumar",75,28,172);
		p1.displayDetails();
		p2.displayDetails();
		p3.displayDetails();
		p4.displayDetails();
	}

}
