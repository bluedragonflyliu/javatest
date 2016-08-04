public class ProxyDemo {
	public static void main(String []args){
		Person p = new Person("小白");
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
		 System.out.println(name+"相亲中......");
	 }
 } 
 class MatchMaker implements Subject{
	 private Subject target; //要代理的目标对象
	 
	 public MatchMaker(Subject target){
		 this.target = target;
	 }
	 //相亲之前做的事
	 private void before(){
		 System.out.println("为代理人匹配");
	 }
	 private void after(){
		 System.out.println("本次相亲结束！");
	 }

	 public void miai(){
		 before();
		 target.miai();
		 after();
	 }
 }
