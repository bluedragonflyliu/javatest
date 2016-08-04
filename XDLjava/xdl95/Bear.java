public class Bear {
	private String name;
	private char sex;
	
	public Bear(){
		this("熊大"); //this关键字加()即this()指代该类的构造函数这里 指的是有一个参数的构造函数
	}
	
	public Bear(String name){
		this(name,'公'); //注意this()必须能放在第一行否则会报错
		System.out.println(name);
	}
	
	public Bear(String name, char sex){
		this.name	= name; //这里的this.name 指的是这个类的属性
		this.sex 	= sex;
		
		this.bite();
	}
	
	public void bite(){
		System.out.println("我是"+name+"熊--"+sex);
	}
	
	public void toMyString(){
		System.out.println("熊类");
	}
	
}
