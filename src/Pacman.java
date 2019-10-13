import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

public class Pacman extends GameObject {
	boolean right;
	boolean left;
	boolean down;
	boolean up;
	double speed =2;
	Pacman(int x, int y, int width, int height) {
		super(x, y, width, height);
		speed=2;
		// TODO Auto-generated constructor stub
	}

	public void draw(Graphics g) {
		g.setColor(Color.yellow);
		g.fillRect(x, y, width, height);
	}

	void update() {
		super.update();
		move();
		if(!objManager.checkDeath(this)) {
			isAlive=false;
		}
	}

	void move() {
		int newX = x;
		int newY = y;
		
		
		
		if (right) {
			newX+=speed;
		}
		if (left) {
			newX-=speed;
		}
		if (up) {
			newY-=speed;
		}
		if (down) {
			newY+=speed;
		}
		
		
		if (!objManager.checkCollision(new Pacman(newX,newY,width,height))) {
			if (right) {
				
				x+=speed;
			}
			if (left) {
				x-=speed;
			}
			if (up) {
				y-=speed;
			}
			if (down) {
				y+=speed;
			}

		}
		
		
		
	}
	
	void oldMove() {
	if (objManager.checkCollision(this)) {
		if (right) {
			x -= 5;
			right = false;
		}
		if (left) {
			x += 5;
			left = false;
		}
		if (up) {
			y += 5;
			up = false;
		}
		if (down) {
			y -= 5;
			down = false;
		}
	}

	if (right) {
		x++;
	}
	if (left) {
		x--;
	}
	if (up) {
		y--;
	}
	if (down) {
		y++;
	}
}
}
//