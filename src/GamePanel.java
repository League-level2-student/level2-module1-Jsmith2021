import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.Graphics; 

public class GamePanel extends JPanel implements ActionListener, KeyListener {
	Timer timer;
	
	GamePanel(){
		timer=new Timer(1000/60,this);
	}
	 @Override

	 public void paintComponent(Graphics g){
		 g.fillRect(10, 10, 100, 100);
	         }
	public void startGame() {
		timer.start();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		repaint();
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("message");
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("hello");
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("hola");
	}
	
	
}
