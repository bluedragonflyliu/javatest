public class InnerClassDemo4 {
	public static void main(String[] args){
		Dog dog = new Dog("Jom"){
			public void say(){
				System.out.println("����һ��������Ĺ���������������"+name);
			}
			
		}; 
		dog.say();
	}
}

class Dog{
	String name;
	public Dog(String name){
		this.name = name;
	}
	public void say(){
		System.out.println("this is a Dog, his name is "+ name);
	}
}
/*
class FamaleDog extends Dog{
	public FamaleDog(String name){
		super(name);
	} 
	public void say(){
		System.out.println("this is a famaleDog "+name);
	}
	
}
*/