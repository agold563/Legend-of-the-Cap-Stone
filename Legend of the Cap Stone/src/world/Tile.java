package world;

import processing.core.PApplet;

public class Tile {
	
	private int x, y;
	private int r, g, b;
	
	
	public Tile(int x, int y) {
		this.x = x;
		this.y = y;
		if(x < 5 || x > 24 || y < 5 || y > 24) {
			this.r = 0;
			this.g = 0;
			this.b = 0;
		}else {
			this.r = 255;
			this.g = 255;
			this.b = 255;
		}
	}
	
	public Tile(int x, int y, int r, int g, int b) {
		this.x = x;
		this.y = y;
		this.r = r;
		this.g = g;
		this.b = b;
	}
	
	public void draw(PApplet marker, int offsetX, int offsetY, boolean debug) {
		marker.fill(r, g, b);
		marker.rect((x-offsetX)*marker.width/11, (y-offsetY)*marker.height/11, (float)(marker.width/11.0), (float)(marker.height/11.0));
		marker.fill(0);
		if(debug) {
			marker.text(x+"  "+y, (x-offsetX)*marker.width/11 + marker.width/22 - 5, (y-offsetY)*marker.height/11 + marker.width/22);
		}
	}
	
}