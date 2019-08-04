import java.awt.Graphics;
import java.util.ArrayList;

public class objManager {
	
	ArrayList<Wall> wallE = new ArrayList<Wall>();
	Ghost ghost=new Ghost(740, 730, 50, 50);
	
	objManager () {
		wallE.add(new Wall(40,40,770,30));
		wallE
		.add(new Wall(40,40,30,390));
		wallE.add(new Wall(40,390,240,40));
		wallE.add(new Wall(120,120,70,100));
		wallE.add(new Wall(120,190,260,30));
		wallE.add(new Wall(240,120,460,30));
		wallE.add(new Wall(450,120,250,90));
		wallE.add(new Wall(340,190,40,140));
		wallE.add(new Wall(120,260,140,80));
		wallE.add(new Wall(330,390,100,70));
		wallE.add(new Wall(340,260,270,70));
		wallE.add(new Wall(490,260,210,50));
		wallE.add(new Wall(490,260,120,150));
		wallE.add(new Wall(670,370,100,40));
		wallE.add(new Wall(670,370,50,80));
		wallE.add(new Wall(760,40,50,270));
		
		int legs = wallE.size();
				for (int iii= 0; iii < legs; iii++ ) {
					Wall wall = wallE.get(iii);
			wallE.add(new Wall( mainClass.width - wall.x - wall.width, wall.y, wall.width,  wall.height));
		}
				 legs = wallE.size();
				for (int iii= 0; iii < legs; iii++ ) {
					Wall wall = wallE.get(iii);
			wallE.add(new Wall( wall.x ,mainClass.height -  wall.y- wall.height, wall.width,  wall.height));
		}
				wallE.add(new Wall(720,490,120,40));		
				
	}
	public void draw(Graphics g) {
		
		for (int i = 0; i < wallE.size(); i++) {
			Wall s = wallE.get(i);
			s.draw(g);
		}
		ghost.draw(g);

		
		}
	

	int score = 0;
	
	
	void scoreAdd (int score) {
		this.score+=score;
	}
	
	int scoreGetter() {
		
		return score;
	}
}
