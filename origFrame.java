package cite.library;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class origFrame extends JFrame{

	

	public origFrame(){


			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
			setTitle("Log in");
			setSize(420,420);	
		    setResizable(false);
		    LoginViewer loginviewer = new LoginViewer(this);
			setVisible(true);

	}

}