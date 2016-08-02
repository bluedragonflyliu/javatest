import java.util.Arrays;
public class ComparatorDemo {
	public static void main(String []args){
		Person[] persons = {
					new Person("zhangson",10),
					new Person("lisi",23),
					new Person("wangwu",32),
					new Person("niuqi",18),
					};
		
		Arrays.sort(persons, new PersonComparator());
		System.out.println(Arrays.toString(persons));
	}
}
