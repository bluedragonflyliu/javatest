public class AnonymousObjectDemo {
	public static void main(String[] args) {
		new Dog("lyly").getName();
	}
}
class Dog {
	private String name;
	public Dog(String name){
		this.name = name;
	}
	public void getName() {
		System.out.println("my name is "+name);
	}
}
