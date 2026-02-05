package com.bmi.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BMICalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("BMI Calculator");
		frame.setLayout(new GridLayout(6,1,10,10));
		frame.setSize(350,450);
		
		JLabel instructionJLabel = new JLabel("Choose Units and enter Details", JLabel.CENTER);
		
		String[] unitString = {"Metrics (kg/m)", "Imperial (lb/in)"};
		JComboBox<String> unitComboBox = new JComboBox<>(unitString);
		
		JTextField weightTextField = new JTextField("Enter Weight");
		JTextField heightTextField = new JTextField("Enter Height");
		JButton calculateButton = new JButton("Calculate BMI");
		JLabel resultLabel = new JLabel("Result:---", JLabel.CENTER);
		
		calculateButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					double weight = Double.parseDouble(weightTextField.getText());
					double height = Double.parseDouble(heightTextField.getText());
					
					double bmi;
					
					if(unitComboBox.getSelectedIndex()==0) {
						 bmi =weight/(height*height);
					} else {
						bmi = 703 * (weight/(height*height));
					}
					
					resultLabel.setText(String.format("Result: %.2f", bmi));
					resultLabel.setForeground(Color.BLACK);
				} catch (NumberFormatException ex) {
					// TODO: handle exception
					resultLabel.setText("Invalid Input");
					resultLabel.setForeground(Color.RED);
				}
				
			}
		});
		
		frame.add(instructionJLabel);
		frame.add(unitComboBox);
		frame.add(weightTextField);
		frame.add(heightTextField);
		frame.add(calculateButton);
		frame.add(resultLabel);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
