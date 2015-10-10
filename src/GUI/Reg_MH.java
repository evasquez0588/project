package phase1;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JTextArea;

public class Reg_MH extends JPanel {
	private JTextField textField;

	/**
	 * Registration Medical History panel.
	 */
	public Reg_MH() {
		setLayout(null);
		setSize(343,210);
		
		JLabel lblNewLabel = new JLabel("Medical History");
		lblNewLabel.setBounds(125, 11, 88, 14);
		add(lblNewLabel);
		
		JLabel lblAllergies = new JLabel("Allergies");
		lblAllergies.setBounds(10, 36, 88, 14);
		add(lblAllergies);
		
		JLabel lblPastMedicalHistory = new JLabel("Past Medical\r\n History");
		lblPastMedicalHistory.setBounds(10, 108, 130, 38);
		add(lblPastMedicalHistory);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.setBounds(125, 176, 89, 23);
		add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(172, 36, 130, 20);
		add(textField);
		textField.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(172, 84, 130, 81);
		add(textArea);
	}
}
