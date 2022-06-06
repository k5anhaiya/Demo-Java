public class App5
{
	public static void main(String[] args) 
	{
		int [] x= {10,20,30,40,50};
		  
		  int j=x.length-1;
		  int i=0;
		  while(i<=j)
		  {
		   //write code to swap value at index i and index j
		   int t=x[i];
		   x[i]=x[j];
		   x[j]=t;
		   i++;
		   j--;
		  }
		  //check
		  for(int c=0;c<x.length;c++)
		   System.out.println(x[c]);
	}
}