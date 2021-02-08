package ticTacToe.UI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
		topLeft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("topLeft");
			}
		});
		
		JButton topMid = new JButton("");
		topMid.setBounds(200, 0, 200, 200);
		topMid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("topMid");
			}
		});
		
		JButton topRight = new JButton("");
		topRight.setBounds(400, 0, 200, 200);
		topRight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("topRight");
			}
		});
		
		JButton midLeft = new JButton("");
		midLeft.setBounds(0, 200, 200, 200);
		midLeft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("midLeft");
			}
		});
		
		JButton midMid = new JButton("");
		midMid.setBounds(200, 200, 200, 200);
		midMid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("midMid");
			}
		});
		
		JButton midRight = new JButton("");
		midRight.setBounds(400, 200, 200, 200);
		midRight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("midRight");
			}
		});
		
		JButton botLeft = new JButton("");
		botLeft.setBounds(0, 400, 200, 200);
		botLeft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("botLeft");
			}
		});
		
		JButton botMid = new JButton("");
		botMid.setBounds(200, 400, 200, 200);
		botMid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("botMid");
			}
		});
		
		JButton botRight = new JButton("");
		botRight.setBounds(400, 400, 200, 200);
		botRight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("botRight");
			}
		});
		
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
