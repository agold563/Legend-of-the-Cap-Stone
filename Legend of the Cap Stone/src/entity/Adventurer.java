package entity;

import item.*;

import processing.core.PApplet;

public class Adventurer extends Entity {
	
	private Inventory inventory;
	
	public Adventurer(int x, int y, int health, int maxHealth) {
		super(x, y, health, maxHealth, 10, 0);
		Item[] items = new Item[] {new Item("Sword"), new Item("Armor")};
		inventory = new Inventory(items);
	}
	
	public void draw(PApplet marker) {
		marker.circle(marker.width/2, marker.height/2, 20);
	}
	public void drawInventory(PApplet marker) {
		marker.fill(0);
		marker.rect(436, 0, 162, 108);
		marker.fill(255);
		marker.text(inventory.toString(), 440, 30);
	}
}

class Inventory {
	
	private Item[] item;
	
	public Inventory(Item[] item) {
		this.item = item;
	}
	
	public String toString() {
		String out = "Items:\n";
		for(int i = 0; i < item.length; i++) {
			out += item[i].toString()+"\n";
		}
		return out;
	}
}