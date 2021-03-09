import processing.core.PApplet;
import java.util.ArrayList;

public class Game {
	
	private PApplet app;
	private ArrayList <Enemy> enemyList;
	private Player player;
	
	private int round;
	private int time;
	private int score;
	
	public Game(PApplet app) {
		this.app = app;
		
		player = new Player(0, 250, 150, 450, app);
		enemyList = new ArrayList<Enemy>();
	}
	
	public void startGame() {
		app.background(250);
		app.frameRate(60);
		player.drawPlayer();
		spawnEnemies();
		
		for(int i = 0; i < enemyList.size(); i++) {
			enemyList.get(i).drawEnemy();
		}
		
	}
	
	public void spawnEnemies() {
		if(app.frameCount == 60) {
			
			System.out.println("entró");
			enemyList.add(new Enemy(255, 100, 100, 0, -50, 1, 1, 5, app));
			app.frameCount = 0;
			
			System.out.println(enemyList.size());
		}
	}
	
	public void keyPressed() {
		player.keyPressed();
	}
}
