import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Wall extends GameObject {
	

 
	Wall(int x, int y, int width, int height) {
		super(x, y, width, height);

		// TODO Auto-generated constructor stub
	}
	public void draw(Graphics g){
		g.setColor(Color.blue);
		g.drawRect(x, y, width, height);
		 g.fillRect(x, y, width, height);
	}

}
