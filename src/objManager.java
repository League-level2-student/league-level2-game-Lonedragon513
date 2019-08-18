import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class objManager {

	static ArrayList<Wall> wallE = new ArrayList<Wall>();
	Ghost ghost1 = new Ghost(730, 450, 30, 30, Color.red);
	Ghost ghost2 = new Ghost(765, 450, 30, 30, Color.pink);
	Ghost ghost3 = new Ghost(800, 450, 30, 30, Color.cyan);
	Ghost ghost4 = new Ghost(835, 450, 30, 30, Color.orange);
	static ArrayList<InterSec> iSec = new ArrayList<InterSec>();

	objManager() {
		wallE.add(new Wall(40, 40, 770, 30));
		wallE.add(new Wall(40, 40, 30, 390));
		wallE.add(new Wall(40, 390, 240, 40));
		wallE.add(new Wall(120, 120, 70, 100));
		wallE.add(new Wall(120, 190, 260, 30));
		wallE.add(new Wall(240, 120, 460, 30));
		wallE.add(new Wall(450, 120, 250, 90));
		wallE.add(new Wall(340, 190, 40, 140));
		wallE.add(new Wall(120, 260, 140, 80));
		wallE.add(new Wall(330, 390, 100, 70));
		wallE.add(new Wall(340, 260, 270, 70));
		wallE.add(new Wall(490, 260, 210, 50));
		wallE.add(new Wall(490, 260, 120, 150));
		wallE.add(new Wall(670, 370, 100, 40));
		wallE.add(new Wall(670, 370, 50, 80));
		wallE.add(new Wall(760, 40, 50, 270));

		int legs = wallE.size();
		for (int iii = 0; iii < legs; iii++) {
			Wall wall = wallE.get(iii);
			wallE.add(new Wall(mainClass.width - wall.x - wall.width, wall.y, wall.width, wall.height));
		}
		legs = wallE.size();
		for (int iii = 0; iii < legs; iii++) {
			Wall wall = wallE.get(iii);
			wallE.add(new Wall(wall.x, mainClass.height - wall.y - wall.height, wall.width, wall.height));
		}
		wallE.add(new Wall(720, 490, 120, 40));

		iSec.add(new InterSec(670, 370, 260, 160));

		iSec.add(new InterSec(640, 340, 10, 10));
		iSec.add(new InterSec(730, 330, 10, 10));
		iSec.add(new InterSec(730, 230, 10, 10));
		iSec.add(new InterSec(730, 90, 10, 10));
	}

	void update() {
		ghost1.update();
		ghost2.update();
		ghost3.update();
		ghost4.update();
		for (int i = 0; i < wallE.size(); i++) {
			Wall s = wallE.get(i);
			s.update();
		}
	}

	public void draw(Graphics g) {

		for (int i = 0; i < wallE.size(); i++) {
			Wall s = wallE.get(i);
			s.draw(g);
		}
		ghost1.draw(g);
		ghost2.draw(g);
		ghost3.draw(g);
		ghost4.draw(g);
		for (int i = 0; i < iSec.size(); i++) {
			InterSec s = iSec.get(i);
			s.draw(g);
		}

	}

	int score = 0;

	void scoreAdd(int score) {
		this.score += score;
	}

	int scoreGetter() {

		return score;
	}

	public static boolean checkCollision(Ghost gw) {
		for (Wall a : wallE) {
			if (gw.collisionBox.intersects(a.collisionBox)) {
				return true;
			}

		}
		return false;

	}

	public static boolean checkI(Ghost gw) {
		for (InterSec i : iSec) {
			if (gw.collisionBox.intersects(i.collisionBox)) {
				return true;
			}

		}
		return false;

	}
}
