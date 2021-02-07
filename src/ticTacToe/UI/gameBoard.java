package ticTacToe.UI;

public class gameBoard {
	
	static int numberOfPlayers;
	
	gameBoard(int playerNum){
		numberOfPlayers = playerNum;
		startGame();
	}
	
	public static int getPlayerNum() {
		return numberOfPlayers;
	}
	
	public static void startGame() {
		System.out.println("Single Player = " + numberOfPlayers);
	}
}
