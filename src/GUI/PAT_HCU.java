package GUI;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class PAT_HCU extends JPanel {

	/**
	 * This is a stand in panel for the patient health care update JPanel
	 */
	public PAT_HCU() {
		setLayout(null);
		setSize(343,210);
		
		JLabel lblScheduleAppt = new JLabel("Health Condition Update");
		lblScheduleAppt.setBounds(95, 11, 128, 14);
		add(lblScheduleAppt);
		
		JLabel lblInsertDesignHere = new JLabel("INSERT DESIGN HERE");
		lblInsertDesignHere.setBounds(10, 63, 135, 14);
		add(lblInsertDesignHere);
	}
}
