import java.awt.Graphics;
import java.util.ArrayList;

public class objManager {
	
	ArrayList<Wall> wallz = new ArrayList<Wall>();
	
	objManager () {
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
