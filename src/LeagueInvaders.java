import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class LeagueInvaders {
JFrame frame= new JFrame();
Timer timer;
JPanel GamePanel;
final double WIDTH=500;
final double HEIGHT=800;
	public static void main(String[] args) {
		new LeagueInvaders().createUI();
		
	}
	public void createUI() {
		frame.setVisible(true);
		frame.add(GamePanel);
		frame.getContentPane().setPreferredSize(new Dimension(WIDTH, HEIGHT));
        frame.pack();
	}
	public class GamePanel extends JPanel implements ActionListener {
		Timer timer=new Timer(1000/60,this);
		JPanel GamePanel = new JPanel();
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			JOptionPane.showMessageDialog(null, "message");
		}
	
	}
	public void startGame() {
		timer.start();
	}
	}

