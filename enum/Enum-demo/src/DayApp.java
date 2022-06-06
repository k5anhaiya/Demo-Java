
public class DayApp
{
	 Day day;
	    
	    public DayApp(Day day) {
	        this.day = day;
	    }
	    
	    public void tellItLikeItIs() 
	    {
	        switch (day)
	        {
	            case Monday:
	                System.out.println("Mondays are bad.");
	                break;
	                    
	            case Friday:
	                System.out.println("Fridays are better.");
	                break;
	                         
	            case Saturday: 
	            case Sunday:
	                System.out.println("Weekends are best.");
	                break;
	                        
	            default:
	                System.out.println("Midweek days are so-so.");
	                break;
	        }
	    }
	    
	    public static void main(String[] args)
	    {
	    
	    	DayApp firstDay = new DayApp(Day.Monday);
	        firstDay.tellItLikeItIs();
	        DayApp thirdDay = new DayApp(Day.Wednesday);
	        thirdDay.tellItLikeItIs();
	        DayApp fifthDay = new DayApp(Day.Friday);
	        fifthDay.tellItLikeItIs();
	        DayApp sixthDay = new DayApp(Day.Saturday);
	        sixthDay.tellItLikeItIs();
	        DayApp seventhDay = new DayApp(Day.Sunday);
	        seventhDay.tellItLikeItIs();
	    }

}
