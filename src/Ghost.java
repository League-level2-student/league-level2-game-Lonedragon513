import java.awt.Color;
import java.awt.Graphics;

public class Ghost extends GameObject{

	Ghost(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
	}
	
	public void draw(Graphics g){
		g.setColor(Color.cyan);
		 g.fillRect(x, y, width, height);
		 g.setColor(Color.red);
		 g.fillRect(x+40, y, width, height);
		 g.setColor(Color.yellow);
		 g.fillRect(x+40+40, y, width, height);
		 g.setColor(Color.yellow);
		 g.fillRect(x+40+40+40, y, width, height);
		 
	}
}
