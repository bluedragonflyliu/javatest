/**
 * һ����Ҫ��ʵ�ֿ�¡���ܱ���
 * 1��ʵ��Cloneable�ӿڣ��ýӿ���һ����ǽӿ�
 * 2����дObject ���е� clone ����
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
