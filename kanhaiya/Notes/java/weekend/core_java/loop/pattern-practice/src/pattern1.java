//print the following
//1,1,2,3,5,8,13,21,34,55   //this series is known as fibonascii series
public class pattern1 
{
	public static void main(String[] args) 
	{
		int firstterm,lastterm,nextterm,n;
		n=55;
		firstterm=0;
		lastterm=1;
		for(int i=0;i<11;i++)
		{
			System.out.print(firstterm+" ");
			nextterm=firstterm+lastterm;
			firstterm=lastterm;
			lastterm=nextterm;
		}
		
	}

}