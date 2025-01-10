package entity;

import processing.core.PApplet;

public class Entity {
	
	private int xPos, yPos;
	private int health, maxHealth;
	
	public Entity(int x, int y, int health, int maxHealth) {
		this.xPos = x;
		this.yPos = y;
		this.health = health;
		this.maxHealth = maxHealth;
	}
	
	public void draw(PApplet marker) {
		marker.fill(0);
		marker.circle(marker.width/2, marker.height/2, 20);
	}
	
	public int getX() {
		return xPos;
	}
	
	public int getY() {
		return yPos;
	}
	
	public int getHealth() {
		return health;
	}
	
	public int getMaxHealth() {
		return maxHealth;
	}
	
	public void setX(int x) {
		this.xPos = x;
	}
	
	public void setY(int y) {
		this.yPos = y;
	}
	
	public void setHealth(int h) {
		this.health = h;
	}
	
	public void setMaxHealth(int h) {
		this.maxHealth = h;
	}
	
}