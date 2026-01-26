package com.mary.app;

import java.awt.*;

import javax.swing.*;

 class BMICalculatorv4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame mary = new JFrame("BMI Calculator 3.0 - Box Layout");
	

		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
		
		Dimension boxSizDimension = new Dimension();
		
		JLabel weightLabel = new JLabel("Weight (kg)");
		panel.add(weightLabel);

		JTextField weightBox = new JTextField(10);
		panel.add(weightBox);
		panel.add(Box.createVerticalStrut(20));

		JLabel heightLabel = new JLabel("Height (kg)");
		panel.add(heightLabel);

		JTextField heightBox = new JTextField(10);
		panel.add(heightBox);
		panel.add(Box.createVerticalStrut(20));
		
		JButton button = new JButton("Calculate");
		panel.add(button);
		
		JLabel resultLabel = new JLabel("Your BMI result: ");
		panel.add(resultLabel);

		JTextField resultBox = new JTextField(10);
		panel.add(heightBox);
		
		mary.add(panel);
		mary.setSize(350, 200);
		mary.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mary.setVisible(true);
		
	}

}
