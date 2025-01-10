package main;

import processing.core.PApplet;

public class Legend {
	
	public static void main(String[] args) {
		Game game = new Game();
		PApplet.runSketch(new String[]{"yeet"}, game);
		game.windowResizable(false);
	}
}