public class ProxyDemo {
	public static void main(String []args){
		Person p = new Person("С��");
		MatchMaker m  = new MatchMaker(p);
		m.miai();
	}
}
 interface Subject{
	 public void miai();
 }
 
 class Person implements Subject{
	 private String name;
	 public Person(String name){
		 this.name = name;
	 }
	 public void miai(){
		 System.out.println(name+"������......");
	 }
 } 
 class MatchMaker implements Subject{
	 private Subject target; //Ҫ�����Ŀ�����
	 
	 public MatchMaker(Subject target){
		 this.target = target;
	 }
	 //����֮ǰ������
	 private void before(){
		 System.out.println("Ϊ������ƥ��");
	 }
	 private void after(){
		 System.out.println("�������׽�����");
	 }

	 public void miai(){
		 before();
		 target.miai();
		 after();
	 }
 }
