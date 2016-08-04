/**
 * 一个类要想实现克隆功能必须
 * 1、实现Cloneable接口，该接口是一个标记接口
 * 2、重写Object 类中的 clone 方法
 * 
 * @author liufu
 *
 */
public class Person implements Cloneable{
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
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
