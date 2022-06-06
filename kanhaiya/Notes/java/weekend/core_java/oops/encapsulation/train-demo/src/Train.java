
public class Train 
{
	private int totalSeats;
	 public Train(int totalSeats)
	 {
	  this.totalSeats=totalSeats;
	 }
	 public void showSeats()
	 {
	  System.out.println("Total available seats are:"+totalSeats);
	 }
	 public void bookSeat()
	 {
	  if(totalSeats>=1)
	  {
	   System.out.println("One seat booked to you!!!");
	   totalSeats--;
	  }
	  else
	   System.out.println("Sorry no seat left!!!");
	 }
	 public void cancelSeat()
	 {
		 System.out.println("Seat cancelled!!!");
		 totalSeats++;
	 
	 }
	 
}
