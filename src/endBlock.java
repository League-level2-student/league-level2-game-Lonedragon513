import java.awt.Color;
import java.awt.Graphics;

public class endBlock extends GameObject {

	endBlock(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
	}
	public void draw(Graphics hi){
		hi.setColor(Color.red);
		hi.drawRect(x, y, width, height);
	}
}
