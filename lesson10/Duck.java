public class Duck {
private static int duckCount = 0;
private int size;
public static void main (String [] args) {
    // System.out.println("Size of duck is  " + size); //静态方法不能使用非静态的方法和变量
    //System.out.println("Size of duck is  " + getSize()); 
    Duck d1 = new Duck();
    Duck d2 = new Duck();
    Duck d3 = new Duck();

    System.out.println("Duck number is " + Duck.duckCount);
   }
    public Duck () {
    	duckCount++;
    }
    public void setSize(int s) {
        size = s;
    }
public int getSize() {
     return size;
    }
}