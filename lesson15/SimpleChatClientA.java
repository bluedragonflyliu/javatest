import java.io.*;
import java.net.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleChatClientA{
	JTextField outgoing;
	PrintWriter writer;
	Socket sock;

	public void go(){
		JFrame frame = new JFrame("ludicrously Simple Chat Client");
		JPanel mainPanel = new JPanel();
		outgoing = new JTextField(20);
		JButton sendButton = new JButton("Send");
		sendButton.addActionListener(new sendButtonListener());
		mainPanel.add(outgoing);
		mainPanel.add(sendButton);
		frame.getContentPane().add(BorderLayout.CENTER,mainPanel);
		setUpNetworking();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,500);
		frame.setVisible(true);
	}

	private void setUpNetworking(){
		try{
			sock = new Socket("127.0.0.1",4242);
			writer = new PrintWriter(sock.getOutputStream());
			System.out.println("Networking");
		} catch(IOException ex){
			ex.printStackTrace();
		}
	}

	public class sendButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent ev){
			try {
				writer.println(outgoing.getText());
				writer.flush();
			} catch(Exception ex) {
				ex.printStackTrace();
			}
			outgoing.setText("");
			outgoing.requestFocus();
		}
	}

	public static void main(String[] args) {
		new SimpleChatClientA().go();
	}
}