import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BMICalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame mary = new JFrame("BMI Calculator 3.0 - Box Layout");
		
		JMenuBar menuBar = new JMenuBar();
		JMenuItem helpMenu = new JMenu("Help");
		
		JMenuItem aboutItem = new JMenuItem("About");
		JMenuItem helpItem = new JMenuItem("Help");
		
		helpMenu.add(aboutItem);
		helpMenu.add(helpMenu);
		
		menuBar.add(helpMenu);

		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS));
		
		Dimension boxSizDimension = new Dimension();
		
		JLabel weightLabel = new JLabel("Weight (kg)");
		panel.add(weightLabel);

		JTextField weightBox = new JTextField(10);
		panel.add(weightBox);
		panel.add(Box.createVerticalStrut(20));

		JLabel heightLabel = new JLabel("Height (m)");
		panel.add(heightLabel);

		JTextField heightBox = new JTextField(10);
		panel.add(heightBox);
		panel.add(Box.createVerticalStrut(20));
		
		JButton button = new JButton("Calculate");
		panel.add(button);
		
		JLabel resultLabel = new JLabel("Your BMI result: ");
		panel.add(resultLabel);

		JTextField resultBox = new JTextField(10);
		panel.add(resultBox);
		panel.add(Box.createVerticalStrut(20));
		
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					double weight = Double.parseDouble(weightBox.getText());
					double height = Double.parseDouble(heightBox.getText());
					
					//bmi = weight/(height*2)
					double bmi;
					
					bmi = weight / (height*2);
					resultBox.setText(String.format("Result: %.2f", bmi));
					
				} catch (NumberFormatException ex) {
					// TODO: handle exception
					resultBox.setText("System Error" + ex.toString());
					resultBox.setForeground(Color.RED);
				}
				
			}
		});
		
		mary.add(panel);
		mary.setSize(350, 200);
		mary.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mary.setVisible(true);
		mary.setJMenuBar(menuBar);

	}

}
