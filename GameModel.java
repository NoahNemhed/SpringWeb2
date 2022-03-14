package com.example.RockPaperScissors;

import java.awt.Choice;
import java.util.Random;

public class GameModel {
	
	
	public static String computerChoice() {
		Random rand = new Random();
		int randomNumber = rand.nextInt(2) + 1;
		
		switch(randomNumber) {
		case 0:
			return "rock";
					
		case 1:
			return "paper";
					
		case 2:
			return "scissors";
					
		}
		return null;
	}
	
	public static boolean validMove(String choice) {
		if(choice.equals("rock") || choice.equals("paper") || choice.equals("scissors")) {
			return true;
		}
		return false;
	}
	
	
	public static String whoWins(String choice) {
		String computerChoice = computerChoice();
		if(validMove(choice.toLowerCase())) {
			String playerChoice = choice;	
			if(playerChoice.equals("rock")) {
				if(computerChoice.equals("rock")) {
					return "Tie";
				}
				if(computerChoice.equals("paper")) {
					Score.setComputerScore(Score.getComputerScore() + 1);
					return "Player choose : " + playerChoice + " Computer choose : " + computerChoice + " Computer won";
				}
				if(computerChoice.equals("scissors")) {
					Score.setPlayerScore(Score.getPlayerScore() + 1);
					return "Player choose : " + playerChoice + " Computer choose : " + computerChoice + " Player won";
				}
				
			}
			
			if(playerChoice.equals("paper")) {
				if(computerChoice.equals("rock")) {
					Score.setPlayerScore(Score.getPlayerScore() + 1);
					return "Player choose : " + playerChoice + " Computer choose : " + computerChoice + " Tie";
				}
				if(computerChoice.equals("paper")) {
					return "Tie";
				}
				if(computerChoice.equals("scissors")) {
					Score.setComputerScore(Score.getComputerScore() + 1);
					return "Player choose : " + playerChoice + " Computer choose : " + computerChoice + " Computer won";
				}
			}
			
			if(playerChoice.equals("scissors")) {
				if(computerChoice.equals("rock")) {
					Score.setComputerScore(Score.getComputerScore() + 1);
					return "Player choose : " + playerChoice + " Computer choose : " + computerChoice + " Computer won";
				}
				if(computerChoice.equals("paper")) {
					Score.setPlayerScore(Score.getPlayerScore() + 1);
					return "Player choose : " + playerChoice + " Computer choose : " + computerChoice + " Tie";
				}
				if(computerChoice.equals("scissors")) {
					return "Tie";
				}
			}
		}return "wrong choice";
		
		

		
		
	}

}
