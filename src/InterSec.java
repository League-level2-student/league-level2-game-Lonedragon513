import java.awt.Color;
import java.awt.Graphics;

public class InterSec extends GameObject {

	InterSec(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
	}
	
	public void draw(Graphics hi){
		hi.setColor(Color.white);
		hi.drawRect(x, y, width, height);
	}
	
}
