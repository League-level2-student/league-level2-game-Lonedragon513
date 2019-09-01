import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Ghost extends GameObject {

	Ghost(int x, int y, int width, int height, Color col) {
		super(x, y, width, height);
		this.col = col;
		// TODO Auto-generated constructor stub
	}

	Color col;
	Random ran = new Random();
	int move = ran.nextInt(4);

	void update() {
		super.update();
		if (move == 0) {
			x++;
		}
		if (move == 1) {
			x--;
		}

		if (move == 2) {
			y++;
		}
		if (move == 3) {
			y--;
		}
		check();
		
		

	}
void check () {
	if (objManager.checkCollision(this)) {
		if (move == 0) {
			move++;
			x-=5;
		}
		else if (move == 1) {
			move=0;
			x+=5;
		}

		else if (move == 2) {
			move++;
			y-=5;
		}
		else if (move == 3) {
			move=2;
			y+=5;
		}
		
	}
	InterSec HiT = objManager.checkI(this);
	if (HiT!= null )
		setPos (HiT.x, HiT.y);
		move= ran.nextInt(4);
	
}
	public void draw(Graphics g) {
		g.setColor(col);
		g.fillRect(x, y, width, height);

	}
	
	
	void setPos (int x, int y) {
		this.x=x;
		this.y=y;
		
	}
}
