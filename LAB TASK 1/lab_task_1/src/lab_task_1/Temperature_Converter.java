package lab_task_1;

import javax.swing.*;
import java.awt.*;


public class Temperature_Converter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame frame = new JFrame("Temperature Converter - Flow Layout");
		
		frame.setLayout(new FlowLayout());
		
		JLabel celsiusLabel = new JLabel("Celsius (°C)");
		frame.add(celsiusLabel);
		JTextField celsiusBox = new JTextField(10);
		frame.add(celsiusBox);
		
		
		JComboBox unit = new JComboBox();
		JLabel unitLabel = new JLabel("Temperature Unit");
		unit.addItem("Kelvin (K)");
		unit.addItem("Celsius (°C)");
		unit.addItem("Farenheit (°F)");
		frame.add(unit);
		
		JLabel resultLabel = new JLabel("Result");
		frame.add(resultLabel);
		JTextField resultBox = new JTextField(10);
		resultBox.setEditable(false);
		frame.add(resultBox);
		//convert
		JButton button = new JButton("Convert");
		frame.add(button);
		JButton button2 = new JButton("Clear");
		frame.add(button2);
		
		//Display
		frame.setSize(350, 200);
		((JFrame) frame).setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
