public class StringBufferDemo {
	public static void main(String [] args){
		String s = "小白";
		StringBuffer sb = new StringBuffer();
		sb.append("我的心情差透了！fuck you");
		sb.insert(1,"草泥马房东！啊啊啊啊");
		System.out.println(sb);
	} 
}
