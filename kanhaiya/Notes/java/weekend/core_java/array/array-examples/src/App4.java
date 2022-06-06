public class App4
{
	public static void main(String[] args) 
	{
		int [] x= {10,20,30,40,50};
		  //copy value of this array into array y in reverse order
		  int [] y=new int[x.length];
		  //without loop code
		  int j=x.length-1;
		  for(int i=0;i<y.length;i++,j--)
		  {
		   y[i]=x[j];//y[0]=x[4];
		  }
		  
		  //check
		  for(int c=0;c<y.length;c++)
		   System.out.println(y[c]);
			
	}
}