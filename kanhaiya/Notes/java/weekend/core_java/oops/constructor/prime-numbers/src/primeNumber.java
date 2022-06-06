
public class primeNumber 
{
	private int i;
	private int prime;
	private int j;
	public primeNumber(int i,int prime,int j)
	{
		this.i=i;
		this.prime=prime;
		this.j=j;
	}
	public void findPrime()
	{
		for(i=2;i<=100;i++)
		{
			for(j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					prime++;
				}
				if(prime==2)
				{
					System.out.print(" "+i);
					prime=0;
				}
			}
		}
	}
}
