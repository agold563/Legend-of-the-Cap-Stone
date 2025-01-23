package entity;

import processing.core.PApplet;

public class Entity {
	
	private int xPos, yPos;
	private int health, maxHealth;
	private int speed, armor;
	
	public Entity(int x, int y, int health, int maxHealth, int speed, int armor) {
		this.xPos = x;
		this.yPos = y;
		this.health = health;
		this.maxHealth = maxHealth;
		this.speed = speed;
		this.armor = armor;
	}
	
	public void draw(PApplet marker, int offsetX, int offsetY) {
		marker.fill(0);
		marker.circle((getX()-offsetX)*marker.width/11 + marker.width/22, (getY()-offsetY)*marker.height/11 + marker.height/22, 20);
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
	
	public void damage(int h) {
		health-=(int)(h*(1.0-armor*0.01));
	}
	
}