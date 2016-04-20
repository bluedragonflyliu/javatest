import java.util.Calendar;
import java.util.TimeZone;

public class TestTime {

    public static void main(String[] args) {

        //指定东八区，即北京时间
        Calendar cc = Calendar.getInstance(TimeZone.getTimeZone("GMT+8"));
        int year = cc.get(Calendar.YEAR);

        //月份是从0开始计数的，所以此处进行加1
        int month = cc.get(Calendar.MONTH)+1;
        int day = cc.get(Calendar.DAY_OF_MONTH);

        int hour_8 = cc.get(Calendar.HOUR);//8小时制
        int hour_24 = cc.get(Calendar.HOUR_OF_DAY);//24小时制

        int minute = cc.get(Calendar.MINUTE);
        int second = cc.get(Calendar.SECOND);

        //需减一（西方一周的第一天是周日）
        int weekday = cc.get(Calendar.DAY_OF_WEEK)-1;

        //8小时制输出
        System.out.println(year+"-"+month+"-"+day+" "+hour_8+":"+minute+":"+second+" 星期"+weekday);

        //24小时制输出
        System.out.println(year+"-"+month+"-"+day+" "+hour_24+":"+minute+":"+second+" 星期"+weekday);
    }
}