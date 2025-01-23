package main;

import entity.*;

import item.*;

import processing.core.PApplet;

public class Battle extends PApplet {
	private Adventurer you;
	private Enemy enemy;
	private int health;
	private double sX, sY;
	private int framesSinceMovement;
	private boolean dash;
	
	public Battle() {
		health = 500;
		sX = 300;
		sY = 300;
	}
	
	public void settings() {
		size(600, 600);
	}
	
	public void draw() {
		background(0);
		fill(255);
		rect(50, 350, 500, 200);
		fill(255, 0, 100);
		rect(50, 565, 500, 20);
		fill(0, 255, 100);
		rect(50, 565, health, 20);
		text(health+"", 560, 575);
		rect((float)sX-10, (float)sY-10, (float)20.0, (float)20.0);
		framesSinceMovement++;
	}
	
	public void keyPressed() {
		if(keyCode == 65) {
			if(framesSinceMovement >= 1) {
				sX-=2;
				framesSinceMovement=0;
			}
		}else if(keyCode == 68) {
			if(framesSinceMovement >= 1) {
				sX+=2;
				framesSinceMovement=0;
			}
		}else if(keyCode == 83) {
			if(framesSinceMovement >= 1) {
				sY+=2;
				framesSinceMovement=0;
			}
		}else if(keyCode == 87) {
			if(framesSinceMovement >= 1) {
				sY-=2;
				framesSinceMovement=0;
			}
		}
	}
}