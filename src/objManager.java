import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class objManager {
	static Pacman pac = new Pacman (735, 575, 10, 10);
	static ArrayList<Wall> wallE = new ArrayList<Wall>();
	static ArrayList<InterSec> iSec = new ArrayList<InterSec>();
	static ArrayList<Point> point = new ArrayList<Point>();
	static int score = 0;
	
//	Ghost ghost1 = new Ghost(645, 345, 1, 1, Color.red);
//	Ghost ghost2 = new Ghost(735, 345, 1, 1, Color.pink);
//	Ghost ghost3 = new Ghost(645, 575, 1, 1, Color.cyan);
//	Ghost ghost4 = new Ghost(735, 575, 1, 1, Color.orange);
//	
//	Ghost ghost1 = new Ghost(645, 345, 10, 10, Color.red);
//	Ghost ghost2 = new Ghost(735, 345, 10, 10, Color.pink);
//	Ghost ghost3 = new Ghost(645, 575, 10, 10, Color.cyan);
//	Ghost ghost4 = new Ghost(735, 575, 10, 10, Color.orange);
//	
	static Ghost ghost1 = new Ghost(44, 44, 23, 23, Color.red);
	static	Ghost ghost2 = new Ghost(1560-23, 44, 23, 23, Color.pink);
	static Ghost ghost3 = new Ghost(44, 860-23, 23, 23, Color.cyan);
	static Ghost ghost4 = new Ghost(1560-23, 860-23, 23, 23, Color.orange);
	static Ghost ghost5 = new Ghost(44, 44, 23, 23, Color.red);
	static	Ghost ghost6 = new Ghost(1560-23, 44, 23, 23, Color.pink);
	static Ghost ghost7 = new Ghost(44, 860-23, 23, 23, Color.cyan);
	static Ghost ghost8 = new Ghost(1560-23, 860-23, 23, 23, Color.orange);
	
	long frameC=0;

	objManager() {
		wallE.add(new Wall(40, 40, 770, 30));
		wallE.add(new Wall(40, 40, 30, 390));
		wallE.add(new Wall(40, 390, 230, 40));
		wallE.add(new Wall(120, 120, 60, 90));
		wallE.add(new Wall(120, 190, 270, 20));
		wallE.add(new Wall(240, 120, 470, 20));
		wallE.add(new Wall(440, 120, 270, 80));
		wallE.add(new Wall(320, 190, 70, 140));
		wallE.add(new Wall(120, 260, 140, 80));
		wallE.add(new Wall(330, 390, 110, 70));
		wallE.add(new Wall(320, 260, 300, 70));
		wallE.add(new Wall(490, 260, 220, 60));
		wallE.add(new Wall(490, 260, 130, 160));
		wallE.add(new Wall(670, 370, 100, 40));
		wallE.add(new Wall(670, 370, 50, 80));
		wallE.add(new Wall(760, 40, 50, 280));
wallE.add(new Wall(720, 490, 120, 40));

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
		wallE.add(new Wall(0,0,1600,1));
		wallE.add(new Wall(0,0,1,900));
		wallE.add(new Wall(0,899,1600,1));
		wallE.add(new Wall(1599,0,1,900));
		
		

		//iSec.add(new InterSec(670, 370, 260, 160));

//		iSec.add(new InterSec(645, 345, 1, 1));
//		iSec.add(new InterSec(735, 345, 1, 1));
//		iSec.add(new InterSec(645, 455, 1, 1));
//		iSec.add(new InterSec(735, 225, 1, 1));
//		iSec.add(new InterSec(415, 225, 1, 1));
//		iSec.add(new InterSec(415, 165, 1, 1));
//		iSec.add(new InterSec(205, 165, 1, 1));
//		iSec.add(new InterSec(205, 95, 1, 1));
//		iSec.add(new InterSec(95, 95, 1, 1));
		makePointz();
//		point.add(new Point(645, 345, 1, 1));
//		point.add(new Point(735, 345, 1, 1));
//		point.add(new Point(645, 455, 1, 1));
//		point.add(new Point(735, 225, 1, 1));
//		point.add(new Point(415, 225, 1, 1));
//		point.add(new Point(415, 165, 1, 1));
//		point.add(new Point(205, 165, 1, 1));
//		point.add(new Point(205, 95, 1, 1));
//		point.add(new Point(95, 95, 1, 1));
//		point.add(new Point(725, 95, 1, 1));
//		point.add(new Point(305, 245, 1, 1));
//		point.add(new Point(95, 245, 1, 1));
//		point.add(new Point(95, 355, 1, 1));
//		point.add(new Point(305, 365, 1, 1));
//		point.add(new Point(465, 365, 1, 1));
//		point.add(new Point(485, 455, 1, 1));
//		point.add(new Point(305, 455, 1, 1));
//		point.add(new Point(475, 95, 1, 1));
		
		
		
//		for ( AAJUSTFORTHISIG = 0; AAJUSTFORTHISIG < ICanSee; AAJUSTFORTHISIG++) {
//			Point Point = iSec.get(AAJUSTFORTHISIG);
//			point.add(new Point(mainClass.width - Point.x - Point.width, Point.y, Point.width, Point.height));
		//}
//		ICanSee = point.size();
//		for ( AAJUSTFORTHISIG = 0; AAJUSTFORTHISIG < ICanSee; AAJUSTFORTHISIG++) {
//			Point Point = point.get(AAJUSTFORTHISIG);
//			point.add(new Point(mainClass.width - Point.x - Point.width, Point.y, Point.width, Point.height));
//		}
//		ICanSee = point.size();
//		for ( AAJUSTFORTHISIG = 0; AAJUSTFORTHISIG < ICanSee; AAJUSTFORTHISIG++) {
//			Point Point = point.get(AAJUSTFORTHISIG);
//			point.add(new Point(Point.x, mainClass.height - Point.y - Point.height, Point.width, Point.height));
//		}
	}
	static void  makePointz() {
		int pointSize=5;
			point.clear();
			point.add(new Point(645, 345, pointSize, pointSize));
			point.add(new Point(735, 345, pointSize, pointSize));
			point.add(new Point(645, 455, pointSize, pointSize));
			point.add(new Point(735, 225, pointSize, pointSize));
			point.add(new Point(415, 225, pointSize, pointSize));
			point.add(new Point(415, 165, pointSize, pointSize));
			point.add(new Point(205, 165, pointSize, pointSize));
			point.add(new Point(205, 95, pointSize, pointSize));
			point.add(new Point(95, 95, pointSize, pointSize));
			point.add(new Point(725, 95, pointSize, pointSize));
			point.add(new Point(305, 245, pointSize, pointSize));
			point.add(new Point(95, 245, pointSize, pointSize));
			point.add(new Point(95, 355, pointSize, pointSize));
			point.add(new Point(305, 365, pointSize, pointSize));
			point.add(new Point(465, 365, pointSize, pointSize));
			point.add(new Point(485, 455, pointSize, pointSize));
			point.add(new Point(305, 455, pointSize, pointSize));
			point.add(new Point(475, 95, pointSize, pointSize));
			
			int ICanSee;
			int AAJUSTFORTHISIG;
			ICanSee = point.size();
			for ( AAJUSTFORTHISIG = 0; AAJUSTFORTHISIG < ICanSee; AAJUSTFORTHISIG++) {
				Point Point = point.get(AAJUSTFORTHISIG);
				point.add(new Point(mainClass.width - Point.x - Point.width, Point.y, Point.width, Point.height));
			}
			ICanSee = point.size();
			for ( AAJUSTFORTHISIG = 0; AAJUSTFORTHISIG < ICanSee; AAJUSTFORTHISIG++) {
				Point Point = point.get(AAJUSTFORTHISIG);
				point.add(new Point(Point.x, mainClass.height - Point.y - Point.height, Point.width, Point.height));
			}
	}
	
	void update() {
		frameC++;
		if (frameC%600==0&&Ghost.speed<768) {
			
			Ghost.speed=Ghost.speed*2;
			pac.speed=pac.speed*3/2;
			System.out.println("THE GHOUSTYDFUGehkdfgkdfssssssssssssssssssssssssssssss         "+Ghost.speed);
			System.out.println("THE PACCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC                "+pac.speed);
		}
		ghost1.update();
		ghost2.update();
		ghost3.update();
		ghost4.update();
		ghost5.update();
		ghost6.update();
		ghost7.update();
		ghost8.update();
		for (int i = 0; i < wallE.size(); i++) {
			Wall s = wallE.get(i);
			s.update();
		}
		pac.update();
		objManager.checkDeath(pac);
		for (int i = 0; i < point.size(); i++) {
			Point s = point.get(i);
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
		ghost5.draw(g);
		ghost6.draw(g);
		ghost7.draw(g);
		ghost8.draw(g);
		for (int i = 0; i < iSec.size(); i++) {
			InterSec s = iSec.get(i);
			s.draw(g);
		}
		pac.draw(g);
		for (int i = 0; i < point.size(); i++) {
			Point s = point.get(i);
			s.draw(g);
		}
	}

	

	 static void scoreAdd() {
		score += 1;
		System.out.println("wardtfcgybuhjnmkl,---------->"+score);
	}

	int scoreGetter() {

		return score;
	}
/**
	public static boolean checkCollision(Ghost gw) {
		for (Wall a : wallE) {
			if (gw.collisionBox.intersects(a.collisionBox)) {
				return true;
			}

		}
		return false;

	
	}
	*/
	
	void hi() {
		
	}
	public static boolean checkCollision(Pacman gw) {
		for (Wall a : wallE) {
			if (gw.collisionBox.intersects(a.collisionBox)) {
				return true;
			}

		}
		return false;
	}

	
	
	
	public static InterSec checkI(Ghost gw) {
		for (InterSec i : iSec) {
			if (gw.collisionBox.intersects(i.collisionBox)) {
				return i;
			}

		}
		return null;

	}
//	public static boolean getP (Pacman gw) {
//		for 
///	}
	public static boolean getPoint (Point p) {
		if (p.collisionBox.intersects(pac.collisionBox)) {
			return true;
		}
		return false;
		
	}
	 public static boolean checkDeath(Pacman gw) {
		
			if (gw.collisionBox.intersects(ghost1.collisionBox)) {System.out.println("SAD");
				
				return false;
			}
			if (gw.collisionBox.intersects(ghost2.collisionBox)) {System.out.println("SAD");
				return false;
			}
			if (gw.collisionBox.intersects(ghost3.collisionBox)) {System.out.println("SAD");
				return false;
			}
			
			if (gw.collisionBox.intersects(ghost4.collisionBox)) {System.out.println("SAD");
				return false;
			}
			if (gw.collisionBox.intersects(ghost5.collisionBox)) {System.out.println("SAD");
			
			return false;
		}
		if (gw.collisionBox.intersects(ghost6.collisionBox)) {System.out.println("SAD");
			return false;
		}
		if (gw.collisionBox.intersects(ghost7.collisionBox)) {System.out.println("SAD");
			return false;
		}
		
		if (gw.collisionBox.intersects(ghost8.collisionBox)) {System.out.println("SAD");
			return false;
		}
		
		return true;

	}
	 
	static void  reset() {
		 ghost1 = new Ghost(44, 44, 23, 23, Color.red);
		 ghost2 = new Ghost(1560-23, 44, 23, 23, Color.pink);
		 ghost3 = new Ghost(44, 860-23, 23, 23, Color.cyan);
		 ghost4 = new Ghost(1560-23, 860-23, 23, 23, Color.orange);
		 ghost5 = new Ghost(44, 44, 23, 23, Color.red);
		 ghost6 = new Ghost(1560-23, 44, 23, 23, Color.pink);
		 ghost7 = new Ghost(44, 860-23, 23, 23, Color.cyan);
		 ghost8 = new Ghost(1560-23, 860-23, 23, 23, Color.orange);
		 pac = new Pacman (735, 575, 10, 10);
		 
		
		 makePointz();
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
