package com.mary.app;

import java.awt.*;
import javax.swing.*;

public class EnergyMonitorApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			JFrame frame = new JFrame();
			frame.setLayout(new FlowLayout(FlowLayout.CENTER, 10,20));
			
			JLabel lblDisplay = new JLabel("MONTHLY Cost:$0.00", SwingConstants.CENTER);
			lblDisplay.setPreferredSize(new Dimension(300,100));
			lblDisplay.setOpaque(true);
			lblDisplay.setBackground(Color.GREEN);
			lblDisplay.setForeground(Color.BLACK);
			lblDisplay.setFont("Arial",Font.BOLD, 1800);
			frame.add(lblDisplay);
			
			frame.add(new JLabel("Aircon(Watts:1500)"))
	}

}
