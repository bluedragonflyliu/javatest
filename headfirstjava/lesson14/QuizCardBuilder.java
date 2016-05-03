import java.util.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.io.*;

public class QuizCardBuilder {
	private JTextArea question;
	private JTextArea answer;
	private ArrayList<QuizCard> cardList;
	private QuizCard currentCardIndex;
	private JFrame frame;
	private JButton nextButton;
	private boolean isShowAnswer;

	public static void main(String[] args) {
		QuizCardBuilder reader = new QuizCardBuilder();
		reader.go();
	}

	public void go(){
		frame = new JFrame("Quiz Card Player");
		JPanel mainPanel = new JPanel();
		Font bigFont = new Font("sanserif",Font.BOLD,24);
		question  = new JTextArea(6,20);
		question.setLineWrap(true);
		question.setEditable(false);
		question.setWrapStyleWord(true);
		question.setFont(bigFont);
		JScrollPane qScroller = new JScrollPane(question);
		qScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		qScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		nextButton = new JButton("show Question");
		mainPanel.add(qScroller);
		mainPanel.add(nextButton);
		answer = new JTextArea(6,20);
		answer.setLineWrap(true);
		answer.setWrapStyleWord(true);
		answer.setFont(bigFont);

		JScrollPane aScroller = new JScrollPane(answer);
		aScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		aScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		JButton nextButton = new JButton("Next Card");
		cardList = new ArrayList<QuizCard>();
		JLabel qLabel = new JLabel("Question:");
		JLabel aLabel = new JLabel("answer:");

		mainPanel.add(qLabel);
		mainPanel.add(aLabel);
		mainPanel.add(aScroller);
		
		nextButton.addActionListener(new NextCardListener());
		JMenuBar menuBar		= new JMenuBar();
		JMenu fileMenu 			= new JMenu("File");
		JMenuItem loadMenuItem 	= new JMenuItem("Load card set");
		loadMenuItem.addActionListener(new OpenMenuListener());
		JMenuItem newMenuItem	= new JMenuItem("New");
		JMenuItem saveMenuItem	= new JMenuItem("Save");
		newMenuItem.addActionListener(new NewMenuLister());
		saveMenuItem.addActionListener(new SaveMenuLister());
		fileMenu.add(newMenuItem);
		fileMenu.add(saveMenuItem);
		menuBar.add(fileMenu);
		frame.setJMenuBar(menuBar);
		frame.getContentPane().add(BorderLayout.CENTER,mainPanel);
		frame.setSize(500,600);
		frame.setVisible(true);
	}

	public class NextCardListener implements ActionListener {
		public void actionPerformed(ActionEvent ev){
			if(isShowAnswer){
				question.setText(currentCard.getAnswer());
				nextButton.setText("Next Card");
				isShowAnswer = false;
			} else {
				if(currentCardIndex < cardList.size()){
					showNextCard();
				} else {
					question.setText("That was last card");
					nextButton.setEnable(false);
				}
			}
		}
	}

	public class SaveMenuLister implements ActionListener{
		public void actionPerformed(ActionEvent ev) {
			QuizCard card = new QuizCard(question.getNext(), answer.getText());
			cardList.add(card);
			JFileChooser fileSave = new JFileChooser();
			fileSave.showSaveDialog(frame);
			saveFile(fileSave.getSelectedFile());
		}
	}
	public class NewMenuLister implements ActionListener{
		public void actionPerformed(ActionEvent ev){
			cardList.clear();
			clearCard();
		}
	}

	public class OpenMenuListener implements ActionListener{
		public void actionPerformed(ActionEvent ev){
			JFileChooser fileOpen = new JFileChooser();
			fileOpen.showOpenDialog(frame);
			loadFile(fileOpen.getSelectedFile());
		}
	}

	private void loadFile(File file) {
		cardList = new ArrayList<QuizCard>();
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line = null;
			while(line = reader.readerLine() !=null) {
				makeCard(line);
			}
			reader.close();
		} catch (Exception ex) {
			System.out.println("couldn't read the card file");
			ex.printStackTrace();
		}
	}

	private void makeCard(String lineToParse){
		String[] result = lineToParse.split("/");
		QuizCard card = new QuizCard(result[0], resultp[1]);
		cardList.add(card);
		System.out.println("make a card");
	}
	private void showNextCard(){
		currentCard = cardList.get(currentCardIndex);
		currentCardIndex++;
		question.setText(currentCard.getQuestion());
		nextButton.setText("show Answers");
		isShowAnswer = true;
	}

	private void clearCard(){
		question.setText("");
		answer.setText("");
		question.requestFocus();
	}

	private void saveFile(File file){
		try{
			BufferedWrite write = new BufferedWriter(file);
			for(QuizCard card:cardList) {
				write.write(card.getQuestion()+"/");
				write.write(card.getAnswer()+"/");
			}
			write.close();
		} catch(IOException ex){
			System.out.println("couldn't write the cardList out");
			ex.printStackTrace();
		}
	}
}