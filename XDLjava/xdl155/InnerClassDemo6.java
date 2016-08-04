public class InnerClassDemo6 {
	public static void main(String[] args) {
		petWalk(new PetAction(){
			public void walk(){
				System.out.println("ÎÒÕıÔÚÍæË££¡");
			}
		});
	}
	public static void petWalk(PetAction pet){
		pet.walk();
	}
}
class Dog {
	String name;
	public Dog(String name) {
		this.name = name;
	}
	
	public void talk(PetAction action){
		System.out.println("I'm "+ name);
	}
}

interface PetAction {
	public void walk();
}
