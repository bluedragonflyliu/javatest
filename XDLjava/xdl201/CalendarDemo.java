package xdl201;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarDemo {
	public static void main(String []args ){
		Calendar c = Calendar.getInstance();
		Calendar c2 = new GregorianCalendar();
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH);
		int day = c.get(Calendar.DATE);
		int day2 = c.get(Calendar.DAY_OF_YEAR);
		
		System.out.println(year);
		System.out.println(month+1);
		System.out.println(day);
		System.out.println(day2);
	}
}
