public class StringBufferDemo {
	public static void main(String [] args){
		String s = "С��";
		StringBuffer sb = new StringBuffer();
		sb.append("�ҵ������͸�ˣ�fuck you");
		sb.insert(1,"������������������");
		System.out.println(sb);
	} 
}
