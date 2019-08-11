import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Ghost extends GameObject{

	Ghost(int x, int y, int width, int height, Color col) {
		super(x, y, width, height);
		this.col=col;
		// TODO Auto-generated constructor stub
	}
	Color col;
	Random ran = new Random();
	void update () {
		super.update();
		int move =ran.nextInt(4);
		if (move==0) {
			while (NoTouchedWaLL==true) {
			 x++;
			    if (NoTouchedWaLL==false)
			    	  break;x--;
			      
			}
	}
		if (move==1) {
			while (NoTouchedWaLL==true) {
				 x--;
				    if (NoTouchedWaLL==false)
				    	break;x++;
				        
	}
		}

		if (move==2) {
			while (NoTouchedWaLL==true) {
				 y++;
				    if (NoTouchedWaLL==false)
				    	break;y--;
				       
			}
	}
		if (move==3) {
				while (NoTouchedWaLL==true) {
					 y--;
					    if (NoTouchedWaLL==false)
					    	break;y++;
					        
	}
		
		}
		
		
	}
	
	public void draw(Graphics g){
		g.setColor(col);
		g.fillRect(x, y, width, height);
	
	}
}

	
