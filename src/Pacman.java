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
    
	
	
	if (objManager.checkCollision(this)) {
		
		}
		
			}
		}
	

//