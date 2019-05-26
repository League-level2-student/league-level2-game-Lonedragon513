import java.awt.Color;
import java.awt.Graphics;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class daPanel extends JPanel implements ActionListener, KeyListener {
	Timer timer;
	gameStuff gstuff;

	daPanel() {
		timer = new Timer(1000 / 100, this);
		gstuff = new gameStuff(0, 800, 100, 100);
	}

	void startGame() {
		timer.start();
	}

	@Override
	public void paintComponent(Graphics g) {
		g.setColor(Color.black);
		// g.fillRect(100, 100, 100, 100);
		gstuff.draw(g);
		System.out.println("hi");
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getKeyCode());
		System.out.println(e.getKeyChar());
		System.out.println(e.getKeyLocation());
		System.out.println(e.getModifiers());
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		repaint();

	}
}