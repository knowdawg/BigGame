import java.awt.Dimension;

import javax.swing.JFrame;

public class LeagueInvaders {
	GamePanel game;
	JFrame frame;
	int width;
	int hight;
	
	public static void main(String[] args) {
		
	
		LeagueInvaders invade = new LeagueInvaders();
		invade.setUp();
		
	}
	
	LeagueInvaders (){
		
		frame = new JFrame();
		game = new GamePanel();
		
	}
	
	void setUp(){
		frame.add(game);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setPreferredSize(new Dimension(width, hight));

        frame.pack();
        game.startGame();
		
	}
	
	
}
