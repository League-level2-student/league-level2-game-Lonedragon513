import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Ghost extends GameObject {

	Ghost(int x, int y, int width, int height, Color col) {
		super(x, y, width, height);
		this.col = col;
		// TODO Auto-generated constructor stub
	}
//	boolean right=false;
//	boolean left=false;
//	boolean down=false;
//	boolean  up=false;
	
	Color col;
	Random ran = new Random();
	int moveX = ran.nextInt(7)-3;
	int moveY = ran.nextInt(7)-3;

	void update() {
		super.update();
		x+=moveX;
		y+=moveY;
		
		if (moveX==0) {
			moveX = ran.nextInt(7)-3;
		}
		if (moveY==0) {
			 moveY = ran.nextInt(7)-3;
		}
		if (x>1560-width||x<40||y<40|| y>860-height) {
			y = y-moveY;
			x=x-moveX;
			moveX = ran.nextInt(7)-3;
			 moveY = ran.nextInt(7)-3;
		}
		/**
		if (x<1570) {
				x++;
		}
		if (x>40) {
			
		}
		*/
		
//		if (y<40) {
//			
//		}
		
	
//		if(right) {
//			x++;
//		}
//		if(left) {
//			x--;
//		}
//		if(up) {
//			y++;
//		}
//		if(down) {
//			y--;
//		}
//		
//		if (move == 0) {
//			right=true;
//		}
//		if (move == 1) {
//			left=true;
//		}
//
//		if (move == 2) {
//			up=true;
//		}
//		if (move == 3) {
//			down=true;
//		}
//		
//		if (x<40) {
//			
//		}
//		check();		

//		if (move == 0) {
//			x++;
//		}
//		if (move == 1) {
//			x--;
//		}
//
//		if (move == 2) {
//			y++;
//		}
//		if (move == 3) {
//			y--;
//		}
//		check();
		
		

	}
void check () {
//	if (objManager.checkCollision(this)) {
//		if (move == 0) {
//			move++;
//			x-=5;
//		}
//		else if (move == 1) {
//			move=0;
//			x+=5;
//		}
//
//		else if (move == 2) {
//			move++;
//			y-=5;
//		}
//		else if (move == 3) {
//			move=2;
//			y+=5;
//		}
		
	}
	InterSec HiT = objManager.checkI(this);
//	if (HiT!= null )
//		setPos (HiT.x, HiT.y);
//		move= ran.nextInt(4);
//	
//}
	public void draw(Graphics g) {
		g.setColor(col);
		g.fillRect(x, y, width, height);

	}
	
	
	void setPos (int x, int y) {
		this.x=x;
		this.y=y;
		
	}
}
