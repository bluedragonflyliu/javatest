import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {
	//说明可能会报错
	public static int add() throws Exception {
		Scanner input = new Scanner(System.in);
		try {
			System.out.println("请输入第一个数！");
			int num1 = input.nextInt();
			System.out.println("请输入第二个数！");
			int num2 = input.nextInt();
			return num1+num2;
		} catch (InputMismatchException ex) {
			throw new Exception("相加运算错误！");
		} finally{
			System.out.println("加法运算结束！");
		}
	}
	
	public static void main(String[] args){
		try{
			System.out.println(add());
		} catch (Exception e){
			e.printStackTrace();
		}
		System.out.println();
	}
}
