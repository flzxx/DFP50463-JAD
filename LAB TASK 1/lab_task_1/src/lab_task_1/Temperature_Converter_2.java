package lab_task_1;

import javax.swing.*;
import java.awt.*;

public class Temperature_Converter_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame frame = new JFrame("Temperature Converter 2 - Grid Layout");
		
		frame.setLayout(new  GridLayout(4,2));
		
		JLabel kelvinLabel = new JLabel("Celsius");
		frame.add(kelvinLabel);
		JTextField kelvinBox = new JTextField(10);
		frame.add(kelvinBox);
		
		
		JComboBox unit = new JComboBox();
		unit.addItem("Kelvin");
		unit.addItem("Celsius");
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
		
		frame.add(kelvinLabel);
		frame.add(kelvinBox);
		frame.add(resultLabel);
		frame.add(kelvinBox);
		frame.add(button);
		frame.add(button2);
		
		
		//Display
		frame.setSize(350, 200);
		((JFrame) frame).setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}

}
