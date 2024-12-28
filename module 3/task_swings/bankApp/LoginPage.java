package task5.bankApp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPage extends JFrame {
    public LoginPage() {
        setTitle("Login Page");
        setLayout(new GridBagLayout());
        
        GridBagConstraints gbc = new GridBagConstraints();
        JLabel lblUsername = new JLabel("Username:");
        JLabel lblPassword = new JLabel("Password:");
        JTextField txtUsername = new JTextField(20);
        JPasswordField txtPassword = new JPasswordField(20);
        JButton btnLogin = new JButton("Login");
        JButton btnRegister = new JButton("Register");


        gbc.insets = new Insets(10, 10, 10, 10); 
        gbc.gridx = 0; gbc.gridy = 0;
        add(lblUsername, gbc);

        gbc.gridx = 1; gbc.gridy = 0;
        add(txtUsername, gbc);

        gbc.gridx = 0; gbc.gridy = 1;
        add(lblPassword, gbc);

        gbc.gridx = 1; gbc.gridy = 1;
        add(txtPassword, gbc);

        gbc.gridx = 0; gbc.gridy = 2;
        gbc.gridwidth = 2; 
        gbc.anchor = GridBagConstraints.CENTER;
        add(btnLogin, gbc);
        gbc.gridy = 3;
        add(btnRegister, gbc);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        setSize(600, 400);
        setVisible(true);

        // Actions
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String username = txtUsername.getText();
                String password = new String(txtPassword.getPassword());

     
                if ("user".equals(username) && "password".equals(password)) {
                    JOptionPane.showMessageDialog(null, "Login Successful!");
                	new HomePage();
//                    System.exit(ABORT);

                } else {
                    JOptionPane.showMessageDialog(null, "Invalid username or password.");
                }
            }
        });

        btnRegister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
          
                JOptionPane.showMessageDialog(null, "Registration feature not implemented.");
            }
        });
    }


    public static void main(String[] args) {

   new LoginPage();
    }
}
