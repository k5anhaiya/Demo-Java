package twoDimensionalArray;

public class twoD 
{
	public static void main(String[] args) 
	{
		//creating an array
		int A[][]=new int[3][4]; //[number of rows][number of columns]
		//creating an array as well as initialising
		int b[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[0].length;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
	}

}
