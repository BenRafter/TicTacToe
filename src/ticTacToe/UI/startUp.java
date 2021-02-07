package ticTacToe.UI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class startUp {
	static JFrame f = new JFrame("Start Up");
	
	public static void closeGui() {
		f.dispose();
	}
	
	public static void startGui() {
		JLabel greetLabel = new JLabel("Welcome to TicTacToe, choose how many players");
		greetLabel.setBounds(50, 100, 300, 40);
		f.add(greetLabel);
		
		JButton onePlayerButton = new JButton("1 Player");
		onePlayerButton.setBounds(0, 150, 100, 70);
		f.add(onePlayerButton);
		
		JButton twoPlayerButton = new JButton("2 Player");
		twoPlayerButton.setBounds(0, 230, 100, 70);
		f.add(twoPlayerButton);
		
		f.setSize(400, 500);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	
	public static void main(String[] args) {
		startGui();
	}
}
