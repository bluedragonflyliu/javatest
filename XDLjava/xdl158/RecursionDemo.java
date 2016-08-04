public class RecursionDemo {
	public static void main(String[] args){
		int result = factorial(5);
		System.out.println(result);
	}
	
	public static int factorial(int num){
		if (num >1){
			num*=factorial(num-1);
		}
		return num;
	}
}
