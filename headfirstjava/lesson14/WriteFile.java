import java.io.*;
class WriteFile {
	public static void main(String [] args) {
		try{
			FileWriter write = new FileWriter("Foo.txt");
			write.write("hello foo!");
			write.close();
		} catch(IOException ex){
			ex.printStackTrace();
		}
	}
}