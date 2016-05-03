import javax.swing.*;
import java.awt.*;

public class Panel2{
	public static void main(String []args){
		Panel2 panel = new Panel2();
		panel.go();
	}

	public void go(){
		JFrame frame = new JFrame();
		JButton button1 = new JButton("button1");
		JButton button2 = new JButton("button2");
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
		panel.add(button1);
		panel.add(button2);
		frame.getContentPane().add(BorderLayout.EAST,panel);
		panel.setBackground(Color.darkGray);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,300);
		frame.setVisible(true);
	}
}