
public class bookApp 
{

	public static void main(String[] args) 
	{
	Book obj=new Book(3);
	obj.showDisplay();
	obj.issuebook(2);
	obj.showDisplay();
	obj.returnbook(2);
	obj.showDisplay();
	obj.issuebook(1);
	obj.showDisplay();
	obj.returnbook(5);
	obj.showDisplay();
	}

}
