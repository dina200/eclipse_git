package gui;
import javax.swing.*;

public class Gui {
	public static void main (String[] args) {
		JFrame frame = new JFrame();
		JButton button = new JButton("click me");
		JRadioButton rbutton = new JRadioButton("click me");
		JCheckBox cbox = new JCheckBox("click me");
		JLabel label = new JLabel("click me");
		JTextArea text = new JTextArea();
		JTable table = new JTable();
		//frame.getContentPane().add(button);
		//frame.getContentPane().add(rbutton);
		//frame.getContentPane().add(cbox);
		//frame.getContentPane().add(label);
		frame.getContentPane().add(table);
		
		
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
}
