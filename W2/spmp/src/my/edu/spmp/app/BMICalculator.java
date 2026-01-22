package my.edu.spmp.app;

import java.awt.FlowLayout;
import javax.swing.*;

@SuppressWarnings("serial")
public class BMICalculator extends JFrame {
	
	public static JFrame createBMIFrame(){
		
JFrame frame = new JFrame();
		
		JTextField heightfield = new JTextField(4);
		JTextField agefield = new JTextField(4);
		JTextField weightfield = new JTextField(4);
		
		JLabel heightJLabel = new JLabel("Height (m)");
		JLabel ageJLabel = new JLabel("Age");
		JLabel weightJLabel = new JLabel("Weight (kg)");
		
		JButton calculateJButton = new JButton("Calculate");
		JButton resetJButton = new JButton("Reset");
		
		frame.setSize(350, 200);
		JPanel panel = new JPanel(new FlowLayout());
		
		panel.add(ageJLabel);
		panel.add(agefield);
		panel.add(heightJLabel);
		panel.add(heightfield);
		panel.add(weightJLabel);
		panel.add(weightfield);
		panel.add(calculateJButton);
		panel.add(resetJButton);
		
		frame.add(panel);
		return frame;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frame = createBMIFrame();
		frame.setVisible(true);
	
	}

}
