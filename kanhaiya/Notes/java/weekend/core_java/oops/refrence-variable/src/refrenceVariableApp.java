
public class refrenceVariableApp 
{
	public static void main(String[] args) 
	{    
		refrenceVariable p1,p2,p3; //code to create the refrence variable.here p1,p2,p3 are the refrence 
		//variable , refrence variable is used to store the refrence id of the object.
		p1=new refrenceVariable(10);  /*code to create the object.when object will be created a refrence id
		will be generated and this refrence id will be stored in the refrence variable.*/
		p2=new refrenceVariable(90);  //code to create the object.
		p3=new refrenceVariable(40);  //code to create the object.
		
		/*System.out.println(num);*/ //this line shows error because refrence of num is not provided.
		
		System.out.println(p1.num);
		System.out.println(p2.num);
		System.out.println(p3.num);
	}
}
