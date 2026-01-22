package my.edu.spmp.app;

import java.awt.FlowLayout;

import javax.swing.*;

public class ClinicAppointment {
	
	public static JFrame ClinicAppointments() {
		
		JFrame frame = new JFrame();
		
		JTextField namefield = new JTextField(8);
		JTextField appoinmentfield = new JTextField(8);
		
		JLabel nameJLabel = new JLabel("Name");
		JLabel appointmentJLabel = new JLabel("Appointment");
		
		JButton confirmJButton = new JButton("Confirm Appointment");
		
		frame.setSize(350, 200);
		JPanel panel = new JPanel(new FlowLayout());
		
		panel.add(namefield);
		panel.add(nameJLabel);
		panel.add(appoinmentfield);
		panel.add(appointmentJLabel);
		panel.add(confirmJButton);
		
		frame.add(panel);
		return frame;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = ClinicAppointments();
		frame.setVisible(true);
	}

}
