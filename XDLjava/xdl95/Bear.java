public class Bear {
	private String name;
	private char sex;
	
	public Bear(){
		this("�ܴ�"); //this�ؼ��ּ�()��this()ָ������Ĺ��캯������ ָ������һ�������Ĺ��캯��
	}
	
	public Bear(String name){
		this(name,'��'); //ע��this()�����ܷ��ڵ�һ�з���ᱨ��
		System.out.println(name);
	}
	
	public Bear(String name, char sex){
		this.name	= name; //�����this.name ָ��������������
		this.sex 	= sex;
		
		this.bite();
	}
	
	public void bite(){
		System.out.println("����"+name+"��--"+sex);
	}
	
	public void toMyString(){
		System.out.println("����");
	}
	
}
