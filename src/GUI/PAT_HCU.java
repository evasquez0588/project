package GUI;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.TextArea;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PAT_HCU extends JPanel {
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public PAT_HCU(ActionListener b) {
		setLayout(null);
		setSize(680,653);
		
		JLabel lblScheduleAppt = new JLabel("Health Condition Update");
		lblScheduleAppt.setBounds(95, 11, 128, 14);
		add(lblScheduleAppt);
		
		JLabel lblSearchForA = new JLabel("Search for a patient:");
		lblSearchForA.setBounds(10, 39, 118, 14);
		add(lblSearchForA);
		
		textField = new JTextField();
		textField.setBounds(124, 56, 86, 20);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(124, 87, 86, 20);
		add(textField_1);
		
		JLabel lblFirstName = new JLabel("First name:");
		lblFirstName.setBounds(49, 59, 65, 14);
		add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last name:");
		lblLastName.setBounds(49, 90, 65, 14);
		add(lblLastName);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.setBounds(121, 118, 89, 23);
		add(btnSearch);
		
		JLabel lblPatientInfo = new JLabel("Patient Info:");
		lblPatientInfo.setBounds(10, 150, 65, 14);
		add(lblPatientInfo);
		
		JLabel lblName = new JLabel("Name: ???");
		lblName.setBounds(49, 175, 65, 14);
		add(lblName);
		
		JLabel lblAddress = new JLabel("Address: ???");
		lblAddress.setBounds(49, 200, 161, 14);
		add(lblAddress);
		
		JLabel lblMedicalHistory = new JLabel("Medical History:");
		lblMedicalHistory.setBounds(10, 247, 161, 14);
		add(lblMedicalHistory);
		
		TextArea textArea = new TextArea();
		textArea.setBounds(104, 247, 380, 75);
		add(textArea);
		
		JLabel lblAllergies = new JLabel("Allergies:");
		lblAllergies.setBounds(10, 339, 161, 14);
		add(lblAllergies);
		
		TextArea textArea_1 = new TextArea();
		textArea_1.setBounds(104, 340, 380, 75);
		add(textArea_1);
		
		JLabel lblNewLabel = new JLabel("Add New Information");
		lblNewLabel.setBounds(95, 443, 215, 14);
		add(lblNewLabel);
		
		JLabel label = new JLabel("Medical History:");
		label.setBounds(10, 481, 161, 14);
		add(label);
		
		JLabel label_1 = new JLabel("Allergies:");
		label_1.setBounds(10, 563, 161, 14);
		add(label_1);
		
		TextArea textArea_2 = new TextArea();
		textArea_2.setBounds(104, 482, 380, 75);
		add(textArea_2);
		
		TextArea textArea_3 = new TextArea();
		textArea_3.setBounds(104, 563, 380, 75);
		add(textArea_3);
		
		JButton btnNewButton = new JButton("Update");
		btnNewButton.setBounds(545, 559, 89, 23);
		add(btnNewButton);
	}
}
