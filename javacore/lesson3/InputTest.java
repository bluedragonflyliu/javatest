package lesson3;

import java.util.Date;
import java.util.Scanner;

public class InputTest {

	public InputTest() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main (String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.print("what is your name?");
		String name =in.nextLine();
		
		System.out.print("How old are you?");
		
		int age = in.nextInt();
		
		System.out.println("Hello. " + name+ ". Next year,you'll be "+(age+1));
		System.out.printf("%1$s %2$tB %2$te, %2$tY","Due date:", new Date());
	}

}
