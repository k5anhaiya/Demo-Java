
public class Display 
{
	public static void main(String[] args) 
	{
	int [] num= {10,45,38,12,68,55,39,11,12,89};
	//Display all the numbers of the array,but all even number should be displayed first
	//then all odd number should be displayed.
	for(int n:num)
	{
		if(n%2==0)
			System.out.println(n);
	}
	for(int n:num)
	{
		if(n%2!=0)
			System.out.println(n);
	}
	}

}
