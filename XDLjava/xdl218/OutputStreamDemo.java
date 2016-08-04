import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamDemo {
	public static void write1(){
		OutputStream out;
		try {
			out = new FileOutputStream("F:\\learn\\test.txt");
			String info = "hello JAVA";
			byte[] bytes = info.getBytes();
			
			for(int i=0;i<bytes.length;i++){
				out.write(bytes[i]);
			}
			out.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	/**
	 *每次输出指定长度的字符
	 */
	public static void write2(){
		try {
			OutputStream o1 = new FileOutputStream("F:\\learn\\test.txt",true); //追加输出
			String s = "Hello World!";
			byte[] b = s.getBytes();
			o1.write(b);
			o1.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String []args){
		write1();
		write2();
	}
}
