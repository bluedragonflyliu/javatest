package xdl212;

import java.io.File;

public class FileDemo2 {
	public static void findFile(File filepath, String ext){
		if(filepath == null){
			return;
		}
		if(filepath.isDirectory()){
			File [] fs = filepath.listFiles();
			if(fs != null){
				for (File f : fs) {
					findFile(f, ext);
				}
			}
		} else {
			String fn = filepath.getPath();
			String fn2 = fn.toLowerCase();
			if(fn2.endsWith(ext)){
				System.out.println(fn);
			}
		}
	}
	public static void main(String []args){
		File file = new File("D:\\mycode");
		String ext = ".jpg";
		findFile(file,ext);
		
	}
	
	
}
