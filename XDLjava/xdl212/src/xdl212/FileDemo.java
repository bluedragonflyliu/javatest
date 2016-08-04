package xdl212;

import java.io.File;
import java.io.IOException;

public class FileDemo {
	public static void main(String[] args ){
		File file1 = new File("F:"+File.separator+"learn"+File.separator+"test.txt"); //File.separator分割符wind\ linux/
		//String s = File.pathSeparator; //路径分割符; unix :
		if (!file1.exists()) {
			try{
				boolean b = file1.createNewFile();
				System.out.println("创建文件："+b);
			} catch(IOException e){
				e.printStackTrace();
			}
			
		}
		//file1.delete(); //删除文件
		file1.getParentFile(); //获得上一级目录
		file1.isDirectory(); //判断是否是目录
		File file = new File("F:"+File.separator+"learn");
		String[] fileName = file.list(); //列出目录中的所有文件；
		 for(String s :fileName) {
			 System.out.println(s);
		 }
		 
		 File[] files = file.listFiles(); //列出目录中的所有文件以File对象数组返回；比较常用
		 for(File f: files){
			 System.out.println(f.getPath()+"-----"+f.length());
		 }
		 
		 File file2 = new File("F:\\one\\two");
		 File file3 = new File("F:\\one\\three");
		 file2.mkdirs(); //创建目录；
		 file2.renameTo(file3); //重命名
	}
}
