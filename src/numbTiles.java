import java.awt.Dimension;

import javax.swing.JFrame;

public class numbTiles {
	final static int width =500;
	final static int height = 1000;
	JFrame f;
	public static void main(String[] args) {
		new numbTiles().setup();
	}
	numbTiles(){
		f=new JFrame();
	}
	
	void setup(){
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		f.setPreferredSize(new Dimension(width, height));
		f.pack();
	}
}