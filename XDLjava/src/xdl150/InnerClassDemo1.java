public class InnerClassDemo1{
    public static void main(String[] args){
        Dog d = new Dog("花花");
        d.say();
        Dog.ChildDog child = null;//声明内部类引用
        child = d.new ChildDog(); //创建内部类的实例
        child.talk();
}
}

class Dog{
    private String name;
    public Dog(String name){
        this.name =name;
    }
    public void say(){
        System.out.println("我是一只狗，主人叫我"+name);
    }

    //内部类（成员内部类）
    class ChildDog{
    	public void talk(){ 
    	System.out.println("我是一只狗，我妈妈的名字是"+name);
    
    	}
    }
}