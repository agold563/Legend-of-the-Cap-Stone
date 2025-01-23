package entity;

import processing.core.PApplet;

public class Enemy extends Entity {
	
	public Enemy(int x, int y, int health, int maxHealth) {
		super(x, y, health, maxHealth, 1, 0);
	}
	
	public void draw(PApplet marker, int x, int y) {
		marker.fill(0);
		super.draw(marker, x, y);
	}
	
	public void follow(Entity e) {
		int x = e.getX();
		int y = e.getY();
		if(Math.abs(getY()-y) > Math.abs(getX()-x)) {
			if(getY() > y) {
				setY(getY()-1);
			}else {
				setY(getY()+1);
			}
		}else {
			if(getX() > x) {
				setX(getX()-1);
			}else {
				setX(getX()+1);
			}
		}
	}
}