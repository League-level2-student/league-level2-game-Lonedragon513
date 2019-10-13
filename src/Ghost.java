import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Ghost extends GameObject {
static int speed=6;
	Ghost(int x, int y, int width, int height, Color col) {
		super(x, y, width, height);
		this.col = col;
		speed=6;
		// TODO Auto-generated constructor stub
	}
//	boolean right=false;
//	boolean left=false;
//	boolean down=false;
//	boolean  up=false;
	
	Color col;
	Random ran = new Random();
	int moveX = ran.nextInt(speed)-speed/2;
	int moveY = ran.nextInt(speed)-speed/2;

	void update() {
		
		super.update();
		x+=moveX;
		y+=moveY;
		
		if (moveX==0) {
			moveX = ran.nextInt(speed)-speed/2;
		}
		if (moveY==0) {
			 moveY = ran.nextInt(speed)-speed/2;
		}
		if (x>1560-width||x<40||y<40|| y>860-height) {
			y = y-moveY;
			x=x-moveX;
			moveX = ran.nextInt(speed)-speed/2;
			 moveY = ran.nextInt(speed)-speed/2;
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
