package DiscreteStructures;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

//graphical user interface
public class ALeeGUI {

	public static void main(String[] args) {
		new GUI();
		
		
		
	}

	public class GUI() {

		
		
		JFrame frame = new JFrame();
		
		JPanel panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(40,40,20,40)); // dimensions in pixels
		panel.setLayout(new GridLayout(0,1));
		
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("DOMINO GUI");
		frame.pack();
		frame.setVisible(true);
		
		
		
		
		
	}
}


	
	

