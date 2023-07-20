package Java;

import java.util.Calendar;
import java.util.Date;

public class DateCurrent {
  public static void main(String[] args) {
	Calendar cal=Calendar.getInstance();
	
	cal.add(Calendar.DATE, 0);
	Date d=cal.getTime();
	System.out.println(cal);
	System.out.println(d);
}
}
