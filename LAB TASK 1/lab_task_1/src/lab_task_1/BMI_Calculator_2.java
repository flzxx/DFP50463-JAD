package lab_task_1;

import javax.swing.*;
import java.awt.*;

public class BMI_Calculator_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("BMI Calculator 2 - Grid Layout");
		
		frame.setLayout(new GridLayout(4,2));
		
		//row 1
		frame.add(new JLabel("Weight (kg)"));
		frame.add(new JTextField(""));
		
		//row 2
		frame.add(new JLabel("Height (m)"));
		frame.add(new JTextField(""));
		
		//row 3
		frame.add(new JButton("Calculate"));
		frame.add(new JLabel("Your BMI is: "));
		
		//row 4
		JTextField resultBox = new JTextField("");
		resultBox.setEditable(false);
		frame.add(resultBox);
		
		frame.setSize(300, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
