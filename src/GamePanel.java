import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener{

  Timer timer;
  @Override

  public void paintComponent(Graphics g){

	  g.fillRect(10, 10, 100, 100);

          }
	GamePanel(){
		
		timer = new Timer(1000 / 60, this);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		repaint();
		
		
	}
	
	void startGame() {
		
		timer.start();
		
	}
	
}
