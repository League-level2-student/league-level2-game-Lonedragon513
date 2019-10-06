import java.awt.Color;
import java.awt.Graphics;

public class Point extends GameObject {

	Point(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
		num=numThe2nd;
		numThe2nd++;
	}
	public int num;
	static int numThe2nd=0;
	
	public void draw(Graphics hi){
		hi.setColor(Color.white);
		hi.drawRect(x, y, width, height);
	}
	boolean pointTDe;
	void update() {
		pointTDe=objManager.getPoint(this);
		      
		if (pointTDe) {
			pointTDe=false;
			x=999999999;
			y=999999999;
			width=0;
			height=0;
			System.out.println("NUMBBBBb     "+num);
		objManager.scoreAdd();}
		super.update();
	}
}
