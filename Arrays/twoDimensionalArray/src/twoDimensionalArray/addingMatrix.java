package twoDimensionalArray;

public class addingMatrix 
{
	public static void main(String[] args) 
	{
		//creating an array
		int A[][]= {{5,6,4,8},{4,5,6,1},{1,2,3,5}};
	
		int b[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		
		int c[][]=new int [3][4];
		for(int i=0;i<A.length;i++)
		{
			for(int j=0;j<A[0].length;j++)
			{
				c[i][j]=A[i][j]+b[i][j];
			}
		}
		for(int x[]:c)
		{
			for(int y:x)
			{
				System.out.print(y+" ");
			}
			System.out.println();
		}
	}

}
