package basics;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Frames {
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Farha Mahzabin");
		frame.setVisible(true);
		frame.setBounds(100, 100, 400, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton button = new JButton();
		button.setText("CLICK");
		frame.add(button);
	}

}