package lab_task_1;

import javax.swing.*;
import java.awt.*;

public class BMI_Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("BMI Calculator - Flow Layout");
		
		frame.setLayout(new FlowLayout());
		
		//Weight
		JLabel weightLabel = new JLabel("Weight (kg)");
		frame.add(weightLabel);
		JTextField weightBox = new JTextField("",5);
		frame.add(weightBox);
		
		//Height
		JLabel heightLabel = new JLabel("Height (m)");
		frame.add(heightLabel);
		JTextField heightBox = new JTextField("",5);
		frame.add(heightBox);
		
		//Calculate Button
		JButton button = new JButton("Calculate");
		frame.add(button);
		
		//Result
		JLabel resultLabel = new JLabel("Your BMI is: ");
		frame.add(resultLabel);
		JTextField resultBox = new JTextField("",10);
		resultBox.setEditable(false);
		frame.add(resultBox);
		
		//Display
		frame.setSize(350, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
