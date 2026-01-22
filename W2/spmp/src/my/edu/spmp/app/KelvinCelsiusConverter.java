package my.edu.spmp.app;

import java.awt.FlowLayout;

import javax.swing.*;

public class KelvinCelsiusConverter  {
	
	public static JFrame createKelvinCelsiusConverter(){
		
		JFrame frame = new JFrame();
		
		JTextField convertfield = new JTextField(8);
		
		JLabel convertJLabel = new JLabel("K");
		
		JButton calculateJButton = new JButton("Calculate");
		JButton clearJButton = new JButton("Clear");
		
		frame.setSize(350, 200);
		JPanel panel = new JPanel(new FlowLayout());
		
		panel.add(convertfield);
		panel.add(convertJLabel);
		panel.add(calculateJButton);
		panel.add(clearJButton);
		
		frame.add(panel);
		return frame;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frame = createKelvinCelsiusConverter();
		frame.setVisible(true);
	}

}
