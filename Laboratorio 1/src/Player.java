import processing.core.PApplet;

import static processing.core.PConstants.RIGHT;
import static processing.core.PConstants.LEFT;

public class Player extends Entity{
	
	private int x;
	
	public Player(int R, int G, int B, int posX, PApplet app) {
		this.R = R;
		this.G = G;
		this.B = B;
		this.x = posX;
		this.app = app;
	}
	
	//Getters
	public int getR() {
		return R;
	}
	public int getG() {
		return G;
	}
	public int getB() {
		return B;
	}
	public int getPosX() {
		return x;
	}
	
	//Setters
	public void setR(int R) {
		this.R = R;
	}
	public void setG(int G) {
		this.G = G;
	}
	public void setB(int B) {
		this.B = B;
	}
	public void setPosX(int posX) {
		this.x = posX;
	}
	
	//Draw Player
	public void drawPlayer() {
		app.fill(R, G, B);
		app.noStroke();
		app.rect(x, 630, 50, 50);
	}
	
	public void moveLeft() {
		if(x > 0) {
			this.x -= 50;
		}
	}
	
	public void moveRight() {
		if(x < 950) {
			this.x += 50;
		}
	}
	
	public void keyPressed() {
		if(app.keyCode == RIGHT) {
			moveRight();
		}
		if(app.keyCode == LEFT) {
			moveLeft();
		}
	}
}
