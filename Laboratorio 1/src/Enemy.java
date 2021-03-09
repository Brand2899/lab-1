import processing.core.PApplet;

public class Enemy extends Entity{
	
	private int x;
	private int y;
	private int lifes;
	private int level;
	private boolean ltr;
	private int speed;
	
	public Enemy(int R, int G, int B, int posX, int posY, int lifes, int level, int speed, PApplet app) {
		this.R = R;
		this.G = G;
		this.B = B;
		this.x = posX;
		this.y = posY;
		this.lifes = lifes;
		this.level = level;
		this.app = app;
		this.speed = speed;
		ltr  = true;
	}
	
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
	public int getPosY() {
		return y;
	}
	public int getLifes() {
		return lifes;
	}
	public int getLevel() {
		return level;
	}
	
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
	public void setPosY(int posY) {
		this.y = posY;
	}
	public void setLifes(int lifes) {
		this.lifes = lifes;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	
	public void drawEnemy() {
		app.fill(R, G, B);
		app.noStroke();
		app.ellipse(x, y, 50, 50);
		moveEnemy();
	}
	
	public void moveEnemy() {
		
		if(x >= 960) {
			ltr = false;
			y += 55;
		}
		if(ltr) {
			x += speed;
			y += 0;
		}else if(!ltr) {
			x -= speed;
			y += 0;
		}
		if(x <= 10) {
			ltr = true;
			y += 55;
		}
	}
}
