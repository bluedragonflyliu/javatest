import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatDemo {
	public static void main(String []args){
		//DateFormat df = DateFormat.getDateInstance();
		DateFormat df = DateFormat.getDateInstance(DateFormat.LONG,Locale.CHINA); //�в����ķ�ʽ �������ڸ�ʽ��� ��ָ�����Է��
		String nowDate = df.format(new Date());
		System.out.println(nowDate);
	} 
}
