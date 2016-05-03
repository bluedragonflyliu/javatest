import java.util.*;
import static java.lang.System.out;
import java.util.TimeZone;
public class CalendarTest {

	public static void main(String[] args) {
		Date today = new Date();
		Calendar c = Calendar.getInstance(TimeZone.getTimeZone("GMT+8"));
		//c.set(2016,04,20,17,38);
		long day1 = c.getTimeInMillis();
		//TimeZone timeZoneNY = TimeZone.getTimeZone("Asia/Shanghai");
		day1 +=1000*60*60;
		System.out.println("·Ö"+c.get(c.MINUTE));
		c.setTimeInMillis(day1);
		System.out.println("new hour" +c.get(c.HOUR_OF_DAY));
		System.out.println("Ê±¼ä" +c.getTime());
	} 
}