package com.example.RockPaperScissors;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameController {

	
	@RequestMapping(value="/choice", method = RequestMethod.POST)
	public String userInput(@RequestParam(value="choice",defaultValue = "rock") String choice) {
		return GameModel.whoWins(choice.toLowerCase());
	}
	
	
	@RequestMapping(value="/result", method = RequestMethod.GET)
	public String result() {
		return "Player score : " + Score.getPlayerScore() + " Computer score : " + Score.getComputerScore();
	}
}
