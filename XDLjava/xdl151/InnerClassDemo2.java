public class InnerClassDemo2 {
	public static void main(String []args){
		Dog d =new Dog("Tom");
		d.talk();
		d.innerClassSay();
	}
}

class Dog {
	private String name;
	
	public Dog(String name){
		this.name = name;
	}
	
	public void talk(){
		System.out.println("my name is "+name);
	}
	
	public void innerClassSay(){
		int age;
		class ChildDog {
			public void say(){
				System.out.println("my mother name is "+name);
			}
		}
		ChildDog c = new ChildDog();
		c.say();
	}
	
}