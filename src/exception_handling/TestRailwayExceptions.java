package exception_handling;

public class TestRailwayExceptions {
public static void main(String[] args) {
	
	
	String travel_date = "21/12/2012";
	
	
	
	
	
	
	TicketBooker ticketBooker = new TicketBooker();
	
	
		try {
			ticketBooker.bookTicket(17031, travel_date, 5, 2);
		} catch (RailwayException e) {
			System.out.println(e.getErrorMessage());
			//e.printStackTrace();
		}
}
}
/*
 * exception_handling.ServiceCancelledException
	at exception_handling.TicketBooker.bookTicket(TestRailwayExceptions.java:77)
	at exception_handling.TestRailwayExceptions.main(TestRailwayExceptions.java:12)

 */

/*
 * The service of train 17031 is cancelled on 21/12/2012

 */



class RailwayException extends Exception
{
    int trainNo;
    private String errorMessage;
    
    RailwayException(int trainNo, String errorMessage)
    {
        this.trainNo = trainNo;
        this.errorMessage = errorMessage;
    }

    String getErrorMessage()
    {
        return errorMessage;
    }
}


class ServiceCancelledException extends RailwayException
{
    String date;

    ServiceCancelledException(int trainNo, String date)
    {
        super(trainNo, "The service of train " + trainNo + " is cancelled on " + date);
    	
        this.date = date;
    }
}

class SeatsNotAvailableException extends RailwayException
{
    String date;

    SeatsNotAvailableException(int trainNo, String date)
    {
        super(trainNo, "There are no seats available for the train " + trainNo + " on " + date);
        this.date = date;
    }
}







class TicketBooker
{
    public void bookTicket(int trainNo, String date, int adults, int children) throws ServiceCancelledException
, SeatsNotAvailableException
   
    {

        if(isServiceCancelled(trainNo, date))
        {
            throw new ServiceCancelledException(trainNo, date); // LINE B
        }

        if(areSeatsAvailable(trainNo, date, adults, children))
        {
            confirmBooking(trainNo, date, adults, children);
        }
        else
        {
            throw new SeatsNotAvailableException(trainNo, date); // LINE C
        }
    }

    private boolean isServiceCancelled(int trainNo, String date)
    {
        // Code for checking if the service is cancelled
        return true; // LINE D
    }

    private boolean areSeatsAvailable(int trainNo, String date, int adults, int children)
    {
        // Code here for checking if the seats are available
        return false; // LINE E
    }

    private void confirmBooking(int trainNo, String date, int adults, int children) 
    {
        // code here to confirm the booking
    	// payment processing
    	
    	
    }
}
