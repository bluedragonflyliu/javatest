import java.awt.*;
import javax.swing.*;
class MyDrawPanel extends JPanel {
	public static void main(String args[]){
		MyDrawPanel mydraw = new MyDrawPanel();
		mydraw.go();
	}
	public void paintComponent(Graphics g) {
		g.setColor(Color.orange);
		g.fillRect(20,50,100,100);
	}
	public void go(){
		JFrame mypanel = new JFrame();
		JButton button = new JButton("click me!");
		button.setSize(10,10);
		mypanel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mypanel.getContentPane().add(button);
		mypanel.setSize(300,300);
		mypanel.setVisible(true);

	}
}