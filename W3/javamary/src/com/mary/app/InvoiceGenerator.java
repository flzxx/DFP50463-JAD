package com.mary.app;

import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class InvoiceGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frame = new JFrame("Invoice Tool(Flow Layout");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 500);
		
		frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10,10));
		frame.add(new JLabel("Client Name: "));
		JTextField  txtClient = new JTextField(15);
		
		frame.add(txtClient);
		
		frame.add(new JLabel("Hourly Rate($): "));
		JTextField  txtRate = new JTextField(15);
		frame.add(txtRate);
		
		frame.add(new JLabel("Hours Worked: "));
		JTextField  txtHours = new JTextField(15);
		frame.add(txtHours);
		
		frame.setVisible(true);
		
		
	}

}
