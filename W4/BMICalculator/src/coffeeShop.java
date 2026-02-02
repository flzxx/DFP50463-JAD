import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class coffeeShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Coffee Shop Order System");
		
		
		frame.setLayout(new GridLayout(6,2));
		
		
		JLabel coffeeLabel = new JLabel("Select Coffee Type");
		frame.add(coffeeLabel);
		
		
		//Coffee Type
		JComboBox type = new JComboBox();
		type.addItem("Latte");
		type.addItem("Espresso");
		type.addItem("Cappucino");
		type.addItem("Mocha"); 
		
		frame.add(type);
		
		//Quantity
		JLabel  quantity = new JLabel("Quantity");
		SpinnerModel quantityModel = new SpinnerNumberModel(1,1,10,1);
		JSpinner quantityJSpinner = new JSpinner(quantityModel);
		frame.add(quantity);
		frame.add(quantityJSpinner);
		
		
		//sugar level
		JLabel sugarLabel = new JLabel("Sugar Level");
		frame.add(sugarLabel);
		
		JComboBox level = new JComboBox();
		level.addItem("High");
		level.addItem("Medium");
		level.addItem("Low");
		
		frame.add(level);
		
		JLabel name = new JLabel("Customer Name");
		frame.add(name);
		
		JTextField nameBox = new JTextField(10);
		frame.add(nameBox);
		frame.add(Box.createVerticalStrut(20));
		
		JButton placeOrderButton = new JButton("Place Order");
		JLabel resultLabel = new JLabel("Order ");
		frame.add(placeOrderButton);
		
		
		
		placeOrderButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				resultLabel.setText("Order for " + name + ": " + quantityJSpinner.getValue() + " coming up! " + type.getSelectedItem());
			}
		});
		
		frame.add(resultLabel);
		frame.setSize(350, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
