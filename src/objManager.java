import java.awt.Graphics;
import java.util.ArrayList;

public class objManager {
	
	ArrayList<Wall> wallz = new ArrayList<Wall>();
	
	objManager () {
		wallz.add(new Wall(40,40,770,30));
		wallz.add(new Wall(40,40,30,390));
		wallz.add(new Wall(40,390,240,40));
		wallz.add(new Wall(120,120,70,100));
		wallz.add(new Wall(120,190,260,30));
		wallz.add(new Wall(240,120,460,30));
		wallz.add(new Wall(450,120,250,90));
		wallz.add(new Wall(0,100,100,100));
		wallz.add(new Wall(0,100,100,100));
		
	}
	public void draw(Graphics g) {
		
		for (int i = 0; i < wallz.size(); i++) {
			Wall s = wallz.get(i);
			s.draw(g);
		}

		
		}
	

	int score = 0;
	
	
	void scoreAdd (int score) {
		this.score+=score;
	}
	
	int scoreGetter() {
		
		return score;
	}
}
