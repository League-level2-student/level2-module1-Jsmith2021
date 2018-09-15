import javax.swing.JFrame;

public class LeagueInvaders {
JFrame frame= new JFrame();
	public static void main(String[] args) {
		new LeagueInvaders().createUI();
		
	}
	public void createUI() {
		frame.setSize(500, 800);
		frame.setVisible(true);
	}
	public void setUp() {
		
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
