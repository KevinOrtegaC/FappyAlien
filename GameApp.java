package flappyAlien;

import javax.swing.JFrame;

public class GameApp {
	public static void main(String[] args) throws Exception
	{
		int appWidth = 371;
		int appHeigth = 626;
		
		JFrame frame = new JFrame("Flappy Alien");
		//frame.setVisible(true);
		frame.setSize(appWidth, appHeigth);
		frame.setLocationRelativeTo(null);
		frame.setAutoRequestFocus(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		FlappyAlien flappyAlien = new FlappyAlien();
		frame.add(flappyAlien);
		frame.pack();
		frame.setVisible(true);
		
		
	}

}
