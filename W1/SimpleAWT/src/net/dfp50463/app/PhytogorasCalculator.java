package net.dfp50463.app;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class PhytogorasCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Frame frame = new Frame("BMI Calculator");
		frame.setLayout(new FlowLayout());
		
		Label alabel = new Label("a =");
		frame.add(alabel);
		
		TextField afield = new TextField("",10);
		frame.add(afield);
		
		Label blabel = new Label("a =");
		frame.add(alabel);
		
		TextField afield = new TextField("",10);
		frame.add(afield);
		
		Label alabel = new Label("a =");
		frame.add(alabel);
		
		TextField afield = new TextField("",10);
		frame.add(afield);
		
		Button calculateButton = new Button("Calculate");
		frame.add(calculateButton);
		
		frame.setSize(350, 150);
		frame.setVisible(true);

	}

}
