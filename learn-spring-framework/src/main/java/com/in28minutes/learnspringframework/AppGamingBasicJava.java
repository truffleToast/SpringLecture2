package com.in28minutes.learnspringframework;

public class AppGamingBasicJava {

	public static void main(String[] args) {
		// Mario Game
		
		//var marioGame = new MarioGame();
		var superContraGame = new SuperContraGame();
		var ganeRunner = new GameRunner(superContraGame);
		ganeRunner.run();
		
	}

}
