package panel;
import java.awt.*;

import javax.swing.*;

public class Panel {

	public static void main(String[] args) {
		Panel panel = new Panel();
		panel.go();
	}
	
	public void go() {
		JFrame f = new JFrame();
		JPanel p = new JPanel();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		p.setBackground(Color.darkGray);
		
		p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
		
		JButton b1 = new JButton("shock me");
		JButton b2 = new JButton("bliss");
		JButton b3 = new JButton("huh?");
		
		p.add(b1);
		p.add(b2);
		p.add(b3);
		f.getContentPane().add(BorderLayout.EAST, p);
		f.setSize(200, 200);
		f.setVisible(true);
		
	}
}
