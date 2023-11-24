package cite.library;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginViewer{
	
		public LoginViewer(JFrame logFrame){


			
			

			JPanel loginPanel = new JPanel();
			loginPanel.setBounds(0,0,420,420);
			loginPanel.setLayout(null);
			loginPanel.setBackground(new Color(50,50,50));
			logFrame.add(loginPanel);

			JLabel logLabel = new JLabel("Username");
			logLabel.setBounds(50,50,150,100);
			logLabel.setForeground(new Color(255,255,255));
			loginPanel.add(logLabel);

			JLabel passLabel = new JLabel("Password");
			passLabel.setBounds(50,150,150,100);
			passLabel.setForeground(new Color(255,255,255));
			loginPanel.add(passLabel);

			JTextField logintxtfield = new JTextField();
			logintxtfield.setBounds(130,85,180,30);
			loginPanel.add(logintxtfield);

			JTextField passtxtfield = new JTextField();
			passtxtfield.setBounds(130,187,180,30);
			loginPanel.add(passtxtfield);

			JButton loginButton = new JButton();
			loginButton.setText("Log in");
			loginButton.setBounds(50,300,130,40);
			loginPanel.add(loginButton);

			JButton registerButton = new JButton();
			registerButton.setText("Register");
			registerButton.setBounds(230,300,130,40);
			loginPanel.add(registerButton);

			registerButton.addActionListener(new ActionListener() {
            
            	public void actionPerformed(ActionEvent e) {

            		logFrame.getContentPane().removeAll();
            		logFrame.repaint();

            		new RegisterViewer(logFrame);



            	}

        	});


			


			


		}

}