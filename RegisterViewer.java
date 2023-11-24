package cite.library;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RegisterViewer{
	
		public RegisterViewer(JFrame logFrame){

			
			JPanel registerPanel = new JPanel();
            logFrame.add(registerPanel);

			registerPanel.setBounds(0,0,420,420);
			registerPanel.setLayout(null);
			registerPanel.setBackground(new Color(0,0,0));

			JLabel logLabel = new JLabel("Enter Username");
			logLabel.setBounds(50,50,150,100);
			logLabel.setForeground(new Color(255,255,255));
			registerPanel.add(logLabel);

			JLabel passLabel = new JLabel("Enter Password");
			passLabel.setBounds(50,150,150,100);
			passLabel.setForeground(new Color(255,255,255));
			registerPanel.add(passLabel);

			JTextField logintxtfield = new JTextField();
			logintxtfield.setBounds(150,85,180,30);
			registerPanel.add(logintxtfield);

			JTextField passtxtfield = new JTextField();
			passtxtfield.setBounds(150,187,180,30);
			registerPanel.add(passtxtfield);

			JButton loginButton = new JButton();
			loginButton.setText("Register");
			loginButton.setBounds(50,300,130,40);
			registerPanel.add(loginButton);

			JButton cancelButton = new JButton();
			cancelButton.setText("Cancel");
			cancelButton.setBounds(230,300,130,40);
			registerPanel.add(cancelButton);

			cancelButton.addActionListener(new ActionListener() {
            
            	public void actionPerformed(ActionEvent e) {

                	logFrame.getContentPane().removeAll();
            		logFrame.repaint();

            		new LoginViewer(logFrame);

                	
            	}

        	});



			


			


		}

}