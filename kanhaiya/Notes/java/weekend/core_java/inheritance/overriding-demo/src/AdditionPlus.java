
public class AdditionPlus extends Addition
{
	private int num3;
	public AdditionPlus(int num1, int num2, int num3)
	{
		super(num1,num2);  //calling parent class instance variables.
		this.num3=num3;    //assigning value to the new instance variables.
	}
		public int sum()
		{
			int res =super.sum();
			res+=num3;
			return res;
		}
}

