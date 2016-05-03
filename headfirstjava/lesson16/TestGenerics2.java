import java.util.*;
public class TestGenerics2{
	public static void main(String []args){
		new TestGenerics2().go();
	}
	public void go() {
	
		ArrayList<Dog> dogs = new ArrayList<Dog>();
		dogs.add(new Dog());
		dogs.add(new Dog());
		dogs.add(new Dog());
		takeAnimals(dogs);
	}

	public void takeAnimals(ArrayList<? extends Animal> animals) {
		for(Animal a:animals) {
			a.eat();
		}
	}
}
abstract class Animal{
	void eat(){
		System.out.println("animals eating");

	}
}
class Dog extends Animal{
	void bark(){}

}
class Cat extends Animal {
	void meow(){};
}