import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {
	//˵�����ܻᱨ��
	public static int add() throws Exception {
		Scanner input = new Scanner(System.in);
		try {
			System.out.println("�������һ������");
			int num1 = input.nextInt();
			System.out.println("������ڶ�������");
			int num2 = input.nextInt();
			return num1+num2;
		} catch (InputMismatchException ex) {
			throw new Exception("����������");
		} finally{
			System.out.println("�ӷ����������");
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
