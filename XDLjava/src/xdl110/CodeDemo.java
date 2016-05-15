package xdl110;

public class CodeDemo {
	//构造块
	{
		System.out.println("我是构造块");
	}
	public CodeDemo(){
		System.out.println("构造方法");
	}
	public static void main(String[] args){
		CodeDemo cd1 = new CodeDemo();
		CodeDemo cd2 = new CodeDemo();
		//普通代码块
		{
			String info = "saaaaa";
			System.out.println(info);
		}
		String info = "sasasa";
		System.out.println(info);
	}
}
