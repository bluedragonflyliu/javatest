package xdl212;

import java.io.File;
import java.io.IOException;

public class FileDemo {
	public static void main(String[] args ){
		File file1 = new File("F:"+File.separator+"learn"+File.separator+"test.txt"); //File.separator�ָ��wind\ linux/
		//String s = File.pathSeparator; //·���ָ��; unix :
		if (!file1.exists()) {
			try{
				boolean b = file1.createNewFile();
				System.out.println("�����ļ���"+b);
			} catch(IOException e){
				e.printStackTrace();
			}
			
		}
		//file1.delete(); //ɾ���ļ�
		file1.getParentFile(); //�����һ��Ŀ¼
		file1.isDirectory(); //�ж��Ƿ���Ŀ¼
		File file = new File("F:"+File.separator+"learn");
		String[] fileName = file.list(); //�г�Ŀ¼�е������ļ���
		 for(String s :fileName) {
			 System.out.println(s);
		 }
		 
		 File[] files = file.listFiles(); //�г�Ŀ¼�е������ļ���File�������鷵�أ��Ƚϳ���
		 for(File f: files){
			 System.out.println(f.getPath()+"-----"+f.length());
		 }
		 
		 File file2 = new File("F:\\one\\two");
		 File file3 = new File("F:\\one\\three");
		 file2.mkdirs(); //����Ŀ¼��
		 file2.renameTo(file3); //������
	}
}
