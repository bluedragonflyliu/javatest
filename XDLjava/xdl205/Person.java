public class Person implements Comparable<Person>{
	private String name;
	private int age;
	
	public Person() {
		
	}
	public Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age = age;
	}
	
	public String toString(){
		return "Person [name = "+name+", age="+age+" ]";
	}
	
	public int compareTo(Person p){
		if(p==null){
			throw new NullPointerException();
		}
		if(this.age>p.age){
			return 1;
			
		} else if(this.age == p.age) {
			return 0;
		} else {
			return -1;
		}
	}
}
