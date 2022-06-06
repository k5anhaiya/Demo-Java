
public class Book 
{
	private int noOfCopy;
	public Book(int noOfCopy)
	{
		this.noOfCopy=noOfCopy;
	}
	public void showDisplay()
	{
		System.out.println("Total number of copies available:"+noOfCopy);
	}
	public void issuebook(int book)
	{
		if(book<=noOfCopy)
		{
		noOfCopy-=book;
		System.out.println(book+" book issued successfully");
		}
		else
		System.out.println("Sorry no book left!!!");
	}
	public void returnbook(int book)
	{
		noOfCopy+=book;
		System.out.println(book+" book returned successfully");
	}
}
