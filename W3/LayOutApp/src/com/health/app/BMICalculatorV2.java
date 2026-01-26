package com.health.app;

import java.awt.*;

import javax.swing.*;

public class BMICalculatorV2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
	JFrame frame = new JFrame();
	frame.setLayout( new GridLayout(4,2));
	
	JLabel weightLabel = new JLabel("Weight (kg)");
	frame.add(weightLabel);
	
	JTextField weightbox = new JTextField(10);
	frame.add(weightBox);
	

	JLabel heightLabel = new JLabel("Height (m)");
	frame.add(heightLabel);
	
	JTextField heightbox = new JTextField(10);
	frame.add(heightBox);
	
	JButton button = new JButton("CAlculate");
	frame.add(button);
	
	JLabel resultLabel = new JLabel("Weight (kg)");
	frame.add(resultLabel);
	
	JTextField resultBox = new JTextField(10);
	frame.add(resultBox);
	
	frame.setSize(350,200);
	frame.setDefauktCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
	

}
}
