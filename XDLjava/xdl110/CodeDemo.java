package xdl110;

public class CodeDemo {
	//�����
	{
		System.out.println("���ǹ����");
	}
	public CodeDemo(){
		System.out.println("���췽��");
	}
	public static void main(String[] args){
		CodeDemo cd1 = new CodeDemo();
		CodeDemo cd2 = new CodeDemo();
		//��ͨ�����
		{
			String info = "saaaaa";
			System.out.println(info);
		}
		String info = "sasasa";
		System.out.println(info);
	}
}
