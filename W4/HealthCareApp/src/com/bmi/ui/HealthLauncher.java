package com.bmi.ui;

import javax.swing.*;
import java.awt.*;

public class HealthLauncher {

	public static void main(String[] args) {
		
		try {
			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		JFrame frame = new JFrame("Health Suite Launcher");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);
		frame.setLayout(new BorderLayout());

		JLabel title = new JLabel("Health Suite Launcher", JLabel.CENTER);
		title.setFont(new Font("Arial", Font.BOLD, 24));
		frame.add(title, BorderLayout.NORTH);

		JPanel gridPanel = new JPanel(new GridLayout(2, 2, 20, 20));
		gridPanel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

		JPanel bmiCard = new JPanel(new BorderLayout());
		JLabel bmiIcon = new JLabel(new ImageIcon("bmi_icon.png"));
		JButton bmiBtn = new JButton("Open App");
		bmiBtn.setFont(new Font("Arial", Font.BOLD, 14));
		bmiBtn.setPreferredSize(new Dimension(160, 40));
		bmiBtn.setMaximumSize(new Dimension(160, 40));
		bmiBtn.setBackground(new Color(255, 165, 0));
		bmiBtn.setForeground(Color.WHITE);
		bmiCard.add(bmiIcon, BorderLayout.CENTER);
		bmiCard.add(bmiBtn, BorderLayout.SOUTH);

		gridPanel.add(bmiCard);
		
		JPanel watercard = new JPanel(new BorderLayout());
		JLabel waterIcon = new JLabel(new ImageIcon("water_icon.png"));
		JButton waterBtnButton = new JButton("Open App");
		waterBtnButton.setBackground(new Color(30, 144, 255));
		
		watercard.add(waterIcon, BorderLayout.CENTER);
		watercard.add(waterBtnButton,BorderLayout.CENTER);
		
		frame.add(gridPanel,BorderLayout.CENTER);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

}
