package utility;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DateExampleTest {
public static void main(String[] args) {
	
	//very important class
	Date obj = new Date(); 
	System.out.println(obj);
	
	//convert a date object into a string
	SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss"); 
	String stringDate = dateFormat.format(obj);
	System.out.println("String Date  :"+stringDate);
	
	dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); 
	String stringDate1 = dateFormat.format(obj);
	System.out.println("String Date  :"+stringDate1);
	
	//take a string and convert to a date object
	
	SimpleDateFormat df = new SimpleDateFormat("dd/mm/yyyy HH:mm:ss");
	String dateInString = "08/15/1947 02:25:56";
	
    try {
		obj = df.parse(dateInString);
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		System.out.println("In catch block");
		e.printStackTrace();
	} 
    
    System.out.println("New Date : "+obj);
    
    //Setting Timezone
    System.out.println("-------------------");
    Calendar now = Calendar.getInstance(); 
    System.out.println("Calendar : "+now);
    
    //Calendar : java.util.GregorianCalendar[time=1690563039389,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Kolkata",offset=19800000,dstSavings=0,useDaylight=false,transitions=7,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2023,MONTH=6,WEEK_OF_YEAR=30,WEEK_OF_MONTH=5,DAY_OF_MONTH=28,DAY_OF_YEAR=209,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=10,HOUR_OF_DAY=22,MINUTE=20,SECOND=39,MILLISECOND=389,ZONE_OFFSET=19800000,DST_OFFSET=0]
    TimeZone timeZone = TimeZone.getTimeZone("IST"); 
    System.out.println(timeZone.getDisplayName());
    
    timeZone = TimeZone.getTimeZone("EST");
    now.setTimeZone(timeZone); // LINE D
    System.out.println(timeZone.getDisplayName());
    System.out.println("Updated time in EST : "+now);
    

    
	
}
}
