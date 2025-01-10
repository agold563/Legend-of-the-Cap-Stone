package world;

import processing.core.PApplet;

public class World {
	
	private Tile[][] tiles;
	private int size;
	private int cameraX, cameraY;
	
	public World(int s) {
		this.size = s;
		tiles = new Tile[size][size];
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				tiles[i][j] = new Tile(j, i);
			}
		}
		cameraX = 0;
		cameraY = 0;
	}
	
	public World(int s, int[][] tilemap) {
		this.size = s;
		tiles = new Tile[size][size];
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				if(tilemap[i][j] == 1) {
					tiles[i][j] = new Tile(j, i, 49, 199, 12);
				}else if(tilemap[i][j] == 2) {
					tiles[i][j] = new Tile(j, i, 199, 177, 12);
				}else {
					tiles[i][j] = new Tile(j, i, 0, 0, 0);
				}
			}
		}
	}
	
	public void draw(PApplet marker, boolean debug) {
		for(int i = cameraY; i < cameraY+11; i++) {
			for(int j = cameraX; j < cameraX+11; j++) {
				tiles[i][j].draw(marker, cameraX, cameraY, debug);
			}
		}
	}
	
	public void moveCamera(int dx, int dy) {
		if(cameraX+dx >= 0) {
			cameraX += dx;
		}
		if(cameraY+dy >= 0) {
			cameraY += dy;
		}
	}
}