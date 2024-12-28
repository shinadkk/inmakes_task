package task5.bankApp;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class ViewCustomerDetailsPage extends JFrame {

    public ViewCustomerDetailsPage() {
        setTitle("View Customer Details");
        setLayout(new BorderLayout());


        String[] columnNames = {"Account Number", "Customer Name", "Opening Date", "Bank Balance"};
        DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);


        Object[][] data = {
            {"123456", "John Doe", "01/01/2023", "$5,000.00"},
            {"654321", "Jane Smith", "02/15/2023", "$10,000.00"},
            {"789012", "Alice Johnson", "03/10/2023", "$7,500.00"},
            {"210987", "Bob Brown", "04/20/2023", "$3,000.00"}
        };

        // here using sample date,can implement databases later
        for (Object[] row : data) {
            tableModel.addRow(row);
        }

        JTable customerTable = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(customerTable);
        add(scrollPane, BorderLayout.CENTER);
        setSize(600, 400);
        setVisible(true);
    }

    public static void main(String[] args) {
    	new ViewCustomerDetailsPage();
    }
}
