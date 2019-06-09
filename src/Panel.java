import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Panel extends JPanel implements ActionListener, KeyListener {
	Timer t;

	final int MENU_STATE = 0;
	final int GAME_STATE = 1;
	final int END_STATE = 2;
	int currentState = END_STATE;
	Font Fount = new Font("Iowan Old Style", Font.BOLD, 48);
	
	Panel() {
		// WEUIKUYXESDFGVHBDISOHGSDIUUIDSGIWEUIKUYXESDFGVHBDISOHGSDIUUIDSGIWEUIKUYXESDFGVHBDISOHGSDIUUIDSGIWEUIKUYXESDFGVHBDISOHGSDIUUIDSGIWEUIKUYXESDFGVHBDISOHGSDIUUIDSGIWEUIKUYXESDFGVHBDISOHGSDIUUIDSGIWEUIKUYXESDFGVHBDISOHGSDIUUIDSGIWEUIKUYXESDFGVHBDISOHGSDIUUIDSGIWEUIKUYXESDFGVHBDISOHGSDIUUIDSGIWEUIKUYXESDFGVHBDISOHGSDIUUIDSGIWEUIKUYXESDFGVHBDISOHGSDIUUIDSGIWEUIKUYXESDFGVHBDISOHGSDIUUIDSGIWEUIKUYXESDFGVHBDISOHGSDIUUIDSGI
		t = new Timer(1 / 604789650, this);
		
		
	}
	
	void startGame() {
		t.start();

	}
	
	void updateMenuState() {

	}

	void updateGameState() {
		
	}

	void updateEndState() {

	}
	
	void drawMenuState(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, mainClass.width, mainClass.height);
		g.setColor(Color.BLUE);
		g.setFont(Fount);
		g.drawString("PacMan", 670, 200);
		g.setFont(Fount);
		g.drawString("Press to start", 620, 400);
		g.setFont(Fount);
		g.drawString("Press SPACE for instructions", 470, 600);
	}
	void drawGameState(Graphics g) {
		
	}
	
	void drawEndState(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, mainClass.width, mainClass.height);
		g.setColor(Color.BLUE);
		g.setFont(Fount);
		g.drawString("PacMan", 670, 200);
		g.setFont(Fount);
		g.drawString("Press to start", 620, 400);
		g.setFont(Fount);
		g.drawString("wip", 700, 600);
	}
	
	public void paintComponent(Graphics g) {
		g.fillRect(10, 10, 100, 100);

		if (currentState == MENU_STATE) {
			drawMenuState(g);
		} else if (currentState == GAME_STATE) {
			drawGameState(g);
		} else if (currentState == END_STATE) {
			drawEndState(g);
		}
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		repaint();

		if (currentState == MENU_STATE) {
			updateMenuState();
		} else if (currentState == GAME_STATE) {
			updateGameState();
		} else if (currentState == END_STATE) {
			updateEndState();
		}
	
	}

}
