public class AdaperDemo {
	public static void main(String []args){
		PowerA powerA = new PowerAImpl();
		start(powerA);
		
		PowerB powerB = new PowerBImpl();
		
		PowerAAdaper pa = new PowerAAdaper(powerB);
		start(pa);
	}
	public static void start(PowerA powerA){
		powerA.insert();
	}
	
}

interface PowerA{
	public void insert();
}
interface PowerB{
	public void connect();
}
class PowerAImpl implements PowerA{
	public void insert(){
		System.out.println("��ԴA�ӿڲ��룬��ʼ������");
	}
}
class PowerBImpl implements  PowerB{
	public void connect(){
		System.out.println("��ԴB�ӿڲ��룬��ʼ������");
	}
}

class PowerAAdaper implements PowerA{
	private PowerB powerB;
	public PowerAAdaper(PowerB powerB){
		this.powerB = powerB;
	}
	public void insert(){
		powerB.connect();
	}
} 