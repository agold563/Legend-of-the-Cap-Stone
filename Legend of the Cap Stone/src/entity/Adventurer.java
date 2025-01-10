package entity;

import processing.core.PApplet;

public class Adventurer extends Entity {
	
	private Inventory inventory;
	private int i;
	
	public Adventurer(int x, int y, int health, int maxHealth) {
		super(x, y, health, maxHealth);
		inventory = new Inventory();
	}
	
	public void drawInventory(PApplet marker) {
		marker.fill(0);
		marker.rect(436, 0, 162, 108);
		marker.fill(255);
		marker.text(inventory.toString(), 440, 30);
	}
}

class Inventory {
	
	public Inventory() {
		
	}
	
	public String toString() {
		return "The inventory is empty";
	}
}