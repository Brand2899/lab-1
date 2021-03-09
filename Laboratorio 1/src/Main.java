import processing.core.PApplet;

public class Main extends PApplet {
	
	private Game g;
	private int pantalla;
	
	public Main() {

	}
	
	public static void main(String[] args) {
		PApplet.main(Main.class.getName());
	}
	
	public void settings() {
		size(1000, 700);
	}
	
	public void setup() {
		g = new Game(this);
		pantalla = 0;
	}
	
	public void draw() {
		switch(pantalla) {
		case 0:
			fill(255);
			textSize(50);
			text("Shoot the bad guys",300, 300);
			fill(255);
			textSize(15);
			text("Idk... if you want, I'm not your dad",300, 325);
			fill(250);
			noStroke();
			rect(400,350, 200,80);
			if(mouseX > 400 && mouseX < 600 && mouseY > 350 && mouseY < 430) {
				fill(180,180,180);
				rect(400,350, 200,80);
			}
			fill(0);
			textSize(40);
			text("PLAY", 450, 405);
			break;
		case 1:
			background(255);
			fill(0);
			textSize(15);
			text("Instructions",300, 300);
			text("Use arrow keys to move left and right, press up to shoot",300, 350);
			text("Click anywhere to continue",300, 400);
			break;
			
		case 2:
			g.startGame();
			break;
		}
	}
	
	public void mousePressed() {
		switch(pantalla) {
		case 0:
			if(mouseX > 400 && mouseX < 600 && mouseY > 350 && mouseY < 430) {
			pantalla = 1;
			}
			break;
		case 1:
			if(mouseX > 0 && mouseX < 1000 && mouseY > 0 && mouseY < 700) {
				pantalla = 2;
				}
			break;
		case 2:
			break;
		}
	}
	
	public void keyPressed() {
		g.keyPressed();
	}
}
