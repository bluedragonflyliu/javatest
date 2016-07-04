public class InnerClassDemo5 {
	public static void main(String[] args) {
		PetAction pet = new PetAction(){
			public void walk(){
				System.out.println("I have a walk");
			}
		};
		pet.walk();
	}
}
class Dog {
	String name;
	public Dog(String name) {
		this.name = name;
	}
	
	public void talk(){
		System.out.println("I'm "+ name);
	}
}

interface PetAction {
	public void walk();
}
