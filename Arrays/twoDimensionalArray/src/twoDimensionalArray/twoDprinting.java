package twoDimensionalArray;

public class twoDprinting 
{
	public static void main(String[] args) 
	{
		//creating an array
		int A[][]=new int[3][4]; //[number of rows][number of columns]
		//creating an array as well as initialising
		int b[][]= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		for(int x[]:b)
		{
			for(int y:x)
			{
				System.out.print(y+" ");
			}
			System.out.println();
		}
	}

}
