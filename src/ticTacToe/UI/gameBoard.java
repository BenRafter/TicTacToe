package ticTacToe.UI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class gameBoard {
	static JFrame f = new JFrame("Game Board");
	static int numberOfPlayers;
	
	gameBoard(int playerNum){
		numberOfPlayers = playerNum;
		if(numberOfPlayers == 1) {
			startSinglePlayerGame();
		}
	}
	
	public static void closeGui() {
		f.dispose();
	}
	
	public static int getPlayerNum() {
		return numberOfPlayers;
	}
	
	public static void startSinglePlayerGame() {
		System.out.println("Single Player Game Started ");
		
		JButton topLeft = new JButton("");
		topLeft.setBounds(0, 0, 200, 200);
		
		JButton topMid = new JButton("");
		topMid.setBounds(200, 0, 200, 200);
		
		JButton topRight = new JButton("");
		topRight.setBounds(400, 0, 200, 200);
		
		JButton midLeft = new JButton("");
		midLeft.setBounds(0, 200, 200, 200);
		
		JButton midMid = new JButton("");
		midMid.setBounds(200, 200, 200, 200);
		
		JButton midRight = new JButton("");
		midRight.setBounds(400, 200, 200, 200);
		
		JButton botLeft = new JButton("");
		botLeft.setBounds(0, 400, 200, 200);
		
		JButton botMid = new JButton("");
		botMid.setBounds(200, 400, 200, 200);
		
		JButton botRight = new JButton("");
		botRight.setBounds(400, 400, 200, 200);
		
		f.add(topLeft);
		f.add(topMid);
		f.add(topRight);
		f.add(midLeft);
		f.add(midMid);
		f.add(midRight);
		f.add(botLeft);
		f.add(botMid);
		f.add(botRight);
		f.setSize(600, 600);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	
	public static void startTwoPlayerGame() {
		System.out.println("Two Player Game Started");
		
		f.setSize(600, 600);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
}
