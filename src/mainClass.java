import java.awt.Dimension;

import javax.swing.JFrame;

public class mainClass {
	JFrame frame;
	final static int width = 1600;
	final static int height = 900;
	Panel GameP = new Panel();
	
	public static void main(String[] args) {
		new mainClass().setup();

	}
	
	public mainClass() {
		// TODO Auto-generated constructor stub
		frame = new JFrame();
	}

	void setup() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.add(GameP);
		frame.getContentPane().setPreferredSize(new Dimension(width, height));
		frame.pack();

		GameP.startGame();
		frame.addKeyListener(GameP);

	}

}
