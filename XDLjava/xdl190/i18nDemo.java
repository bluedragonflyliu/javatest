package xdl190;

import java.text.MessageFormat;
import java.util.Arrays;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class i18nDemo {
	public static void main(String []args){
		Locale locale = new Locale("en", "US");
		//ͨ��ResourceBundle���������Դ�ļ����������ļ����Ļ������֣�
		ResourceBundle res = ResourceBundle.getBundle("xdl190.info",locale);
		Scanner input = new Scanner(System.in);
		String inputKey = res.getString("input");
		//�����ð󶨵���Դ�ļ��������ļ����и���key��ȡ��Ӧ��value
		String usernameKey = res.getString("username");
		String passwordKey = res.getString("password");
		String infoSuccessKey = res.getString("info.success");
		String infoFailKey = res.getString("info.fail");
		String us = MessageFormat.format(inputKey, usernameKey);
		System.out.println(us);
		String username = input.next();
		String pwd = MessageFormat.format(inputKey, passwordKey);
		System.out.println(pwd);
		String password = input.next();
		
		
		if("admin".equals(username)&&"123".equals(password)){
			//����̬�ı�
			String success = MessageFormat.format(infoSuccessKey, username);
			System.out.println(success);
		} else {
			System.out.println(infoFailKey);
		}
		
		int [] num = {2,3,4,5,6,7,8,9};
		
		Arrays.sort(num);
		/*
		for(int i:num){
			System.out.println(i);
		}
		*/
		System.out.println(num[3]);
	}	
}
