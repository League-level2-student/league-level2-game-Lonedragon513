import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Panel extends JPanel implements ActionListener, KeyListener {
	Timer t;

	final int MENU_STATE = 0;
	final int GAME_STATE = 1;
	final int END_STATE = 2;
	int currentState = MENU_STATE;
	Font Fount = new Font("Iowan Old Style", Font.BOLD, 48);
	Font FountS = new Font("Tamil MN", Font.BOLD, 9);
	objManager charaMan = new objManager();
	
	public static int cF =0;

	Panel() {
		// WEUIKUYXESDFGVHBDISOHGSDIUUIDSGIWEUIKUYXESDFGVHBDISOHGSDIUUIDSGIWEUIKUYXESDFGVHBDISOHGSDIUUIDSGIWEUIKUYXESDFGVHBDISOHGSDIUUIDSGIWEUIKUYXESDFGVHBDISOHGSDIUUIDSGIWEUIKUYXESDFGVHBDISOHGSDIUUIDSGIWEUIKUYXESDFGVHBDISOHGSDIUUIDSGIWEUIKUYXESDFGVHBDISOHGSDIUUIDSGIWEUIKUYXESDFGVHBDISOHGSDIUUIDSGIWEUIKUYXESDFGVHBDISOHGSDIUUIDSGIWEUIKUYXESDFGVHBDISOHGSDIUUIDSGIWEUIKUYXESDFGVHBDISOHGSDIUUIDSGIWEUIKUYXESDFGVHBDISOHGSDIUUIDSGI
		t = new Timer(1000 / 60, this);

	}

	void startGame() {
		t.start();

	}

	void updateMenuState() {

	}

	void updateGameState() {
		charaMan.update();
		cF++;
		if(objManager.pac.isAlive==false ) {
			currentState = END_STATE;
			//
			objManager.reset();
		}
		
	}

	void updateEndState() {
		
	}

	void drawMenuState(Graphics g) {
		g.setColor(Color.gray);
		g.fillRect(0, 0, mainClass.width, mainClass.height);
		g.setColor(Color.white);
		g.setFont(Fount);g.drawString("Not", 670, 200);
		g.drawString("PacMan", 670, 250);
		g.setFont(Fount);
		g.drawString("Press any key to start", 600, 400);
		g.setFont(Fount);
		g.drawString("Press SPACE for instructions", 470, 600);
		g.drawString("Press ENTER to go to the end", 470, 800);       
		charaMan.score=0;
	}
	
	void drawGameState(Graphics g) {
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(0, 0, mainClass.width, mainClass.height);
		g.setColor(Color.white);
		g.setFont(FountS);
		g.drawString("score =  " + charaMan.scoreGetter(), 2, 10);
		charaMan.draw(g);
	}

	void drawEndState(Graphics g) {
		g.setColor(Color.gray);
		g.fillRect(0, 0, mainClass.width, mainClass.height);
		g.setColor(Color.white);
		g.setFont(Fount);
		g.drawString("PacMan", 670, 200);
		g.setFont(Fount);
		g.drawString("Press SPACE to menu", 600, 400);
		g.setFont(Fount);
		g.drawString("score : " + charaMan.scoreGetter(), 700, 600);
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
		System.out.println(e.getKeyCode());
		System.out.println(e.getKeyChar());
		System.out.println(e.getKeyLocation());
		System.out.println(e.getModifiers());

		if (e.getKeyCode() == 32) {
			if (currentState == MENU_STATE) {
//				JOptionPane.showMessageDialog(null, "To further explain the rules let's break it down as follows:\n"
//						+ "Pacman, our hero, munches his way around the room, eating all of the Pac-dots.\n"
//						+ "In each corner of the room there is a \"Power Pellet\", which when Pacman eats one, the Ghosts turn blue or yellow. Pacman can get extra points by eating the Ghosts. The first one is worth 200 points and each additional Ghost eaten is worth double the number of points.\n"
//						+ "When the player reaches 10,000 points, he gets an additional life - but that only happens once during the game. \n "
//						+ "http://www.pacxon.net/pacman-rules.php");
//				
				JOptionPane.showMessageDialog(null, "You are the yellow dot. your goal is trying to eat all the white dots.\n"
						+ "after ur done, click enter to end the game. If u got hit buy one of the color block, u lose. ");
			}if (currentState == END_STATE) {
			currentState = MENU_STATE;
		}
		} else if (currentState == MENU_STATE) {
			currentState = GAME_STATE;
		}
		
		
		if (e.getKeyCode() == 10) {
			if (currentState == GAME_STATE) {
				currentState = END_STATE;
			}
		}
		if (e.getKeyCode() == 37) {
			objManager.pac.left = true;
			objManager.		pac.up = false;
			objManager.		pac.right = false;
			objManager.		pac.down = false;
			System.out.println("left+");
		}
		if (e.getKeyCode() == 38) {
			objManager.pac.up = true;
			objManager.		pac.right = false;
			objManager.	pac.left = false;
			objManager.		pac.down = false;

			System.out.println("up+");
		}
		if (e.getKeyCode() == 39) {
			objManager.pac.right = true;
			objManager.	pac.left = false;
			objManager.		pac.up = false;
			objManager.		pac.down = false;

			System.out.println("right+");
		}
		if (e.getKeyCode() == 40) {
			objManager.pac.down = true;
			objManager.	pac.left = false;
			objManager.		pac.up = false;
			objManager.		pac.right = false;

			System.out.println("down+");
		}
		
		}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
if (e.getKeyCode() == 37) {
	//chara.	pac.left = false;
			System.out.println("left-");
		}
		if (e.getKeyCode() == 38) {
	//		chara.		pac.up = false;
			System.out.println("up-");
		}
		if (e.getKeyCode() == 39) {
	//		chara.		pac.right = false;
			System.out.println("right-");
		}
		if (e.getKeyCode() == 40) {
	//		chara.		pac.down = false;
			System.out.println("down-");
		}
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
	
