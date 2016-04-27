import java.io.*;
import java.net.*;
import java.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SimpleChatClientA{
	JTextField outgoing;
	PrintWriter writer;
	Socket sock;

	public void go(){
		JFame frame = new JFame("ludicrously Simple Chat Client");
		JPanel mainPanel = new JPanel();
		outgoing = new JTextField(20);
		JButton sendButton = new JButton("Send");
		sendButton.addActionListener(new sendButtonListener());
		mainPanel.add(outgoing);
		mainPanel.add(sendButton);
	}

	private void setUpNetworking(){

	}

	public class sendButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent ev){

		}
	}
}