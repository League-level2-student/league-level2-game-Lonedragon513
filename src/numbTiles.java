import java.awt.Dimension;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class numbTiles {
	final static int width =500;
	final static int height = 1000;
	JFrame f;
	daPanel panel = new daPanel();

	public static void main(String[] args) {
		new numbTiles().setup();
	}
	numbTiles(){
		f=new JFrame();
	}
	
	void setup(){
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		f.addKeyListener(panel);
		f.getContentPane().setPreferredSize(new Dimension(width, height));
		f.pack();
		
		 panel.startGame();
	}
}