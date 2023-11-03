package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.PackmanGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		// Mario Game
		
		//var game = new MarioGame();
		//var game = new SuperContraGame();
		var game = new PackmanGame();
		
		var ganeRunner = new GameRunner(game);
			//2: 객체 생성과 + 의존성 결합
			// Game is a Dependency of GameRunner'
			
		ganeRunner.run();

	}

}
