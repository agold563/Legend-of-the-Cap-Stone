package main;

import world.*;
import entity.*;

import processing.core.PApplet;

public class Game extends PApplet {
	
	private World world;
	private Adventurer creature;
	private Enemy joe;
	private boolean debug;
	private int frameCount;
	private int framesSinceMovement;
	
	public Game() {
		world = new World(30);
		creature = new Adventurer(5, 5, 100, 100);
		joe = new Enemy(20, 20, 100, 100);
		frameCount = 0;
		framesSinceMovement = 0;
	}
	
	public void settings() {
		size(600, 600);
	}
	
	public void draw() {
		background(255);
		world.draw(this, debug);
		creature.draw(this);
		creature.drawInventory(this);
		joe.draw(this, creature.getX(), creature.getY());
		if(debug) {
			fill(0, 0, 0);
			rect(0, 0, 216, 54);
			fill(255, 255, 255);
			text("Pos: "+(joe.getX()-5)+" "+(joe.getY()-5), 5, 30);
			text("Hp: "+creature.getHealth(), 60, 30);
			text(frameCount+"", 110, 30);
			text(frameRate+"", 160, 30);
		}
		gameLoop();
	}
	
	public void gameLoop() {
		frameCount++;
		framesSinceMovement++;
	}
	
	public void keyPressed() {
		if(keyCode == 65) {
			if(creature.getX() > 5) {
				if(framesSinceMovement >= 30) {
					creature.setX(creature.getX()-1);
					world.moveCamera(-1, 0);
					framesSinceMovement = 0;
					joe.follow(creature);
				}
			}
		}else if(keyCode == 68) {
			if(creature.getX() < 24) {
				if(framesSinceMovement >= 30) {
					creature.setX(creature.getX()+1);
					world.moveCamera(1, 0);
					framesSinceMovement = 0;
					joe.follow(creature);
				}
			}
		}else if(keyCode == 83) {
			if(creature.getY() < 24) {
				if(framesSinceMovement >= 30) {
					creature.setY(creature.getY()+1);
					world.moveCamera(0, 1);
					framesSinceMovement = 0;
					joe.follow(creature);
				}
			}
		}else if(keyCode == 87) {
			if(creature.getY() > 5) {
				if(framesSinceMovement >= 30) {
					creature.setY(creature.getY()-1);
					world.moveCamera(0, -1);
					framesSinceMovement = 0;
					joe.follow(creature);
				}
			}
		}else if(keyCode == 88) {
			debug = !debug;
		}
	}
}