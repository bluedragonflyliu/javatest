import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputStreamDemo {
	public static void read1(){
		try {
			InputStream in = new FileInputStream("F:\\learn\\test.txt");
			byte b = -1;
			while((b = (byte) in.read())!=-1){
				System.out.print((char)b);
			}
			in.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void read2(){
		try {
			File f = new File("F:\\learn\\test.txt");
			InputStream in = new FileInputStream(f);
			byte [] bs = new byte[(int)f.length()];
			int len = in.read(bs);
			System.out.println(new String(bs));
			System.out.println(len);
			in.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void read3(){
		try {
			File f = new File("F:\\learn\\test.txt");
			InputStream in = new FileInputStream(f);
			byte [] bs = new byte[10];
			int len  = -1;
			StringBuilder sb = new StringBuilder();
			while((len = in.read(bs))!=-1){
				sb.append(new String(bs,0,len));
				System.out.println(len);
			}
			System.out.println(sb);
			
			in.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String [] args){
		//read1();
		//read2();
		read3();
	}
}
