
public class EvenOdd 
{

	public static void main(String[] args) 
	{
	int [] num= {1,20,50,33,80,12,345,67,190,1,45,66,120};
	int even=0,odd=0;
	for(int x:num)
	{
	if(x%2==0)
	{
		even++;
	}
	else
	{
		odd++;
	}
	}
	System.out.println("total even number:"+even);
	System.out.println("total odd number:"+odd);

	}

}
