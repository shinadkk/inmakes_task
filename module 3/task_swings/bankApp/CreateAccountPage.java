package task5.bankApp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class CreateAccountPage extends JFrame {
	
    public CreateAccountPage() {
        setTitle("Create Account");
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        JLabel lblTitle = new JLabel("Create Account");
        lblTitle.setFont(new Font("Arial", Font.BOLD, 24));

        JLabel lblAccountNumber = new JLabel("Account Number:");
        JTextField txtAccountNumber = new JTextField(20);

        JLabel lblPersonName = new JLabel("Person Name:");
        JTextField txtPersonName = new JTextField(20);

        JLabel lblDepositAmount = new JLabel("Deposit Amount:");
        JTextField txtDepositAmount = new JTextField(20);

        JLabel lblDepositDate = new JLabel("Deposit Date:");
        JSpinner dateSpinner = new JSpinner(new SpinnerDateModel());
        JSpinner.DateEditor dateEditor = new JSpinner.DateEditor(dateSpinner, "MM/dd/yyyy");
        dateSpinner.setEditor(dateEditor);
        dateSpinner.setValue(new Date());
        
        JButton btnSave = new JButton("Save");
        JButton btnCancel = new JButton("Cancel");


        gbc.insets = new Insets(10, 10, 10, 10);

        gbc.gridx = 0; gbc.gridy = 0; gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        add(lblTitle, gbc);

        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.WEST;

        gbc.gridx = 0; gbc.gridy = 1;
        add(lblAccountNumber, gbc);

        gbc.gridx = 1; gbc.gridy = 1;
        add(txtAccountNumber, gbc);

        gbc.gridx = 0; gbc.gridy = 2;
        add(lblPersonName, gbc);

        gbc.gridx = 1; gbc.gridy = 2;
        add(txtPersonName, gbc);

        gbc.gridx = 0; gbc.gridy = 3;
        add(lblDepositAmount, gbc);

        gbc.gridx = 1; gbc.gridy = 3;
        add(txtDepositAmount, gbc);

        gbc.gridx = 0; gbc.gridy = 4;
        add(lblDepositDate, gbc);

        gbc.gridx = 1; gbc.gridy = 4;
        add(dateSpinner, gbc);

        gbc.gridx = 0; gbc.gridy = 5;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        add(btnSave, gbc);

        gbc.gridy = 6;
        add(btnCancel, gbc);
        setSize(600, 400);
        setVisible(true);

        btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Account saved successfully!");
            }
        });

        btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }

    // Main method to run the program
    public static void main(String[] args) {

    	new CreateAccountPage();
    }
}
