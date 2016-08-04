public class InnerClassDemo3 {
	public static void main(String[] args){
		Dog.ChildDog child = new Dog.ChildDog();
		child.talk();
	}
}

class Dog{
	private String name;
	public Dog(String name){
		this.name = name;
	}
	public void say(){
		System.out.println("I'a a dog,my name is "+ name);
	}
	
	static class ChildDog{
		public void talk(){
			System.out.println("I'a a small dog");
		}
	}
}
