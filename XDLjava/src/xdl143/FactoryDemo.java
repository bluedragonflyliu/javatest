public class FactoryDemo{
	public static void main(String []args){
		Doll clothDoll = DollFactory.getInstance("cloth");
		if(clothDoll != null){
			System.out.println(clothDoll.getInfo());
		}
		Doll barbieDoll = DollFactory.getInstance("barbie");
		if(barbieDoll != null){
			System.out.println(barbieDoll.getInfo());
		}
	}
}
class DollFactory {
	public static Doll getInstance(String name){
		if("cloth".equals(name)){
			return new ClothDoll();
		} else if("babie".equals(name)){
			return new BarbieDoll();
		}
		return null;
	} 
}
interface Doll{
	public String getInfo();
}

class ClothDoll implements Doll{
	public String getInfo(){
		
		return "你有个布娃娃!";
	}
}

class BarbieDoll implements Doll{
	public String getInfo(){
		return "你有一个芭比娃娃啊！";
	}
}
