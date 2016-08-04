import java.util.Comparator;

public class PersonComparator implements Comparator<Person>{
	public int compare(Person p1, Person p2) {
		if(p1 ==null){
			throw new NullPointerException();
		}
		if (p1.getAge()<p2.getAge()) {
			return -1;
		} else if (p1.getAge()>p2.getAge()) {
			return 1;
		} else {
			return 0;
		}
	}
}
