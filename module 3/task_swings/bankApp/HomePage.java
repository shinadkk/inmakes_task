package task5.bankApp;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomePage extends JFrame {
    public HomePage() {
        setTitle("Home Page");
        setSize(600, 400);
        
        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        JMenu viewMenu = new JMenu("View");
        JMenu optionMenu = new JMenu("Option");
        JMenu windowMenu = new JMenu("Window");
        JMenu helpMenu = new JMenu("Help");
        JMenu aboutMenu = new JMenu("About");


        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(viewMenu);
        menuBar.add(optionMenu);
        menuBar.add(windowMenu);
        menuBar.add(helpMenu);
        menuBar.add(aboutMenu);


        JMenuItem createNewAccountItem = new JMenuItem("Create New Account");
        JMenuItem printCustomerBalanceItem = new JMenuItem("Print Customer Balance");
        JMenuItem exitApplicationItem = new JMenuItem("Exit Application");


        fileMenu.add(createNewAccountItem);
        fileMenu.add(printCustomerBalanceItem);
        fileMenu.addSeparator(); 
        fileMenu.add(exitApplicationItem);

        setJMenuBar(menuBar);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        createNewAccountItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	new CreateAccountPage();

            }
        });

        printCustomerBalanceItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	new ViewCustomerDetailsPage();
            }
        });

        exitApplicationItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }


    public static void main(String[] args) {

	new HomePage();
    }
}
