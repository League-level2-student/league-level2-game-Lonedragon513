import java.awt.Color;
import java.awt.Graphics;

public class Point extends GameObject {

	Point(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
	}
	
	public void draw(Graphics hi){
		hi.setColor(Color.white);
		hi.drawRect(x, y, width, height);
	}
	boolean pointTDe;
	void update() {
		pointTDe=objManager.getPoint(this);
		
		if (pointTDe) {
			objManager.scoreAdd(1);
			x=999999999;
			y=999999999;
			width=999999999;
			height=999999999;
		}
	}
}
