import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatDemo {
	public static void main(String []args){
		//DateFormat df = DateFormat.getDateInstance();
		DateFormat df = DateFormat.getDateInstance(DateFormat.LONG,Locale.CHINA); //有参数的方式 设置日期格式风格 ，指定语言风格
		String nowDate = df.format(new Date());
		System.out.println(nowDate);
	} 
}
