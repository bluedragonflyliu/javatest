public class CloneDemo {
	public static void main(String []args){
		Person p = new Person("уехЩ",20);
		System.out.println("p = "+p);
		try{
			Person p1 = (Person) p.clone();
			System.out.println("p1 = "+p1);
		} catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
