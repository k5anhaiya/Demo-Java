
public class CalculatorPlus extends Calculator
{
	public void subtract(int num1, int num2)
	{
		int res=num1-num2;
		System.out.println("subtract="+res);
	}
	public void divide(int num1, int num2)
	{
		double res=(double)num1/num2;
		System.out.println("Divide="+res);
	}
}
