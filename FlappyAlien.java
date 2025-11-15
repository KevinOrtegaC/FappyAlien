package flappyAlien;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;

public class FlappyAlien extends JPanel{
	int gameWidth = 371;
	int gameHeigth = 626;
	
	// Images
	Image backGround;
	Image alienShip;
	Image obstacles;
	
	
	FlappyAlien(){
		setPreferredSize(new Dimension(gameWidth, gameHeigth));
		
		backGround = new ImageIcon(getClass().getResource("./moongame.png")).getImage();
		alienShip = new ImageIcon(getClass().getResource("./finalAlien.png")).getImage();
		obstacles = new ImageIcon(getClass().getResource("./astro1.png")).getImage();
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		draw(g);
	}
	
	public void draw(Graphics g) {
		g.drawImage(backGround, 0, 0, gameWidth, gameHeigth, null);
	}
	

}
