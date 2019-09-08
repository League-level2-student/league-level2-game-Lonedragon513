import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

public class Pacman extends GameObject {
	boolean right;
	boolean left;
	boolean down;
	boolean  up;
	
	Pacman(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
	}
	public void draw(Graphics g){
		g.setColor(Color.yellow);
		g.fillRect(x, y, width, height);
}

	void update () {
		super.update();
		
	if (objManager.checkCollision(this)) {
		if (right) {
			x-=5;
			right=false;
    	}
     	if (left) {
     		x+=5;
			left=false;
    	}
     	if (up) {
    		y+=5;
    		up=false;
    	}
     	if (down) {
    		y-= 5;
    		down=false;
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