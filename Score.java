package com.example.RockPaperScissors;

public class Score {
	static int playerScore;
	static int computerScore;
	public static int getPlayerScore() {
		return playerScore;
	}
	public static void setPlayerScore(int playerScore1) {
		playerScore += playerScore1;
	}
	public static int getComputerScore() {
		return computerScore;
	}
	public static void setComputerScore(int computeScore1) {
		computerScore += computeScore1;
	}
	
	

}
