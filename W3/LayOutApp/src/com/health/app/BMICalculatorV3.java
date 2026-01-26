package com.health.app;

import java.awt.*;

import javax.swing.*;

public class BMICalculatorV3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
	JFrame frame = new JFrame();
	frame.setLayout( new BorderLayout());
	
	JPanel inputPanel = new JPanel(new GridLayout(2,2));
	JLabel weightLabel = new JLabel("Weight (kg)");
	frame.add(weightLabel);
	
	JTextField weightbox = new JTextField(10);
	frame.add(weightBox);
	

	JLabel heightLabel = new JLabel("Height (m)");
	frame.add(heightLabel);
	
	JTextField heightbox = new JTextField(10);
	frame.add(heightBox);
	
	frame.add(inputJPanel,BorderLayout.NORTH);
	
	JButton button = new JButton("Calculate");
	frame.add(button);
	
	JPanel resultPanel = new JPanel(new GridLayout(2,2));
	JLabel resultLabel = new JLabel("Weight (kg)");
	frame.add(resultLabel);
	
	JTextField resultBox = new JTextField(10);
	frame.add(resultBox);
	
	frame.add(resultJPanel,BorderLayout.SOUTH);
	
	
	frame.setSize(350,200);
	frame.setDefauktCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
	

}
}
