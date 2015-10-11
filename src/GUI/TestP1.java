package GUI;

import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;

public class TestP1 extends JPanel {

	/**
	 * This panel is for testing the first set of instructions required
	 */
	public JButton b1,b2,b3;
	
	public TestP1(ActionListener e) {
		setLayout(null);
		setSize(500,300);
		
		JLabel lblClickOnOne = new JLabel("Click on one of the below buttons to test said feature");
		lblClickOnOne.setBounds(84, 11, 306, 14);
		add(lblClickOnOne);
		
		b1 = new JButton("Registration");
		b1.setBounds(39, 61, 158, 23);
		b1.addActionListener(e);
		add(b1);
		
		b2 = new JButton("Schedule Appointments");
		b2.setBounds(39, 124, 174, 23);
		b2.addActionListener(e);
		add(b2);
		
		b3 = new JButton("Update Health Conditions");
		b3.setBounds(39, 196, 174, 23);
		b3.addActionListener(e);
		add(b3);
		


	}

}
