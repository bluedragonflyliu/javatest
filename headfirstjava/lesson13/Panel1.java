import javax.swing.*;
import java.awt.*;
public class Panel1{
	public static void main(String[] args) {
		Panel1 gui = new Panel1();
		gui.go();
	}
	public void go(){
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton("shock me!"); 
	panel.add(button);
	panel.setBackground(Color.darkGray);
	frame.getContentPane().add(BorderLayout.EAST, panel);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setSize(400,300);
	frame.setVisible(true);
	}
}