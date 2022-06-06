
public class AirthmeticLargeSmall 
{
	public static void main(String[] args) 
	{
		 int [] num= {10,567,39,890,6,5789,234,5345,10,0,-1};
		  //Write code to display largest,smallest number and sum,average of numbers
		 int max=num[0];
		 int min=num[0];
		 int sum=num[0];
		 for(int i=1;i<num.length;i++)
		 {
			 if(num[i]>max)
				 max=num[i];
			 if(num[i]<min)
				 min=num[i];
			 sum=sum+num[i];
		 }
		 System.out.println("Largest Number="+max);
		 System.out.println("Smallest Number="+min);
		 System.out.println("Sum of all Numbers="+sum);
		 double avg=(double)sum/num.length;
		 System.out.println("Average of all Numbers="+avg);
	}

}
