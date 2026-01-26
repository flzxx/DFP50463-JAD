package com.mary.app;

import javax.swing.*;
import java.awt.*;

public class BMICalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame mary = new JFrame("BMI Calculator");
		mary.setLayout(new FlowLayout());

		JLabel weightLabel = new JLabel("Weight (kg)");
		mary.add(weightLabel);

		JTextField weightBox = new JTextField(10);
		mary.add(weightBox);

		JLabel heightLabel = new JLabel("Height (kg)");
		mary.add(heightLabel);

		JTextField heightBox = new JTextField(10);
		mary.add(heightBox);
		
		JButton button = new JButton("Calculate");
		mary.add(button);
		
		JLabel resultLabel = new JLabel("Your BMI result: ");
		mary.add(resultLabel);

		JTextField resultBox = new JTextField(10);
		mary.add(resultBox);
		
		mary.setSize(350, 200);
		mary.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mary.setVisible(true);
		
		

	}

}
